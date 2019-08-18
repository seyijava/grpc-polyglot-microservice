package com.bigdataconcept.microservice.grpc.trader.quote

import pl.zankowski.iextrading4j.client.IEXTradingClient
import pl.zankowski.iextrading4j.client.rest.request.stocks.QuoteRequestBuilder
import pl.zankowski.iextrading4j.api.stocks.Quote
import java.util.Calendar
import java.util.Date;
import scala.math.BigDecimal.javaBigDecimal2bigDecimal
import org.apache.log4j.Logger;


case class StockQuote(name: String,symbol: String, lastPrice: BigDecimal, change: BigDecimal, changePercent: Float, timeStamp: Date
    ,marketCap: Float, volume: Long,  high: BigDecimal, low: BigDecimal, open: BigDecimal)



trait IStockQuoteService{
  
   @throws(classOf[SymbolNotFoundException])
   def getQuote(sybmol: String): StockQuote
   
   
   @throws(classOf[SymbolNotFoundException])
   def getQuotes(symbols: Array[String]): List[StockQuote]
  
}


class SymbolNotFoundException(message: String) extends Exception(message)
{
     
}

class StockQuoteService extends IStockQuoteService
{
 
   val log = Logger.getLogger(getClass.getName)
  
  
  @throws(classOf[SymbolNotFoundException])
   override def getQuote(symbol: String) : StockQuote={
    val quote =  callIextradingQuote(symbol)
    return mapQuoteToStockQuote(quote)
  }

  
  
   @throws(classOf[SymbolNotFoundException])
   override def getQuotes(symbols: Array[String]): List[StockQuote]= {
    var stockQuotes: List[StockQuote] = List()
    val symbolSets = Set(symbols: _*)
    val qoutes = callIextradingQuotes(symbolSets)
    qoutes.foreach(
      stockQuote=>{
         stockQuotes = this.mapQuoteToStockQuote(stockQuote) :: stockQuotes
        }
    )
   return stockQuotes
   }
   
 
  
  
  @throws(classOf[SymbolNotFoundException])
  private def callIextradingQuote(symbol: String): Quote= {
    var iexTradingClient = IEXTradingClient.create();
    var quote: Quote = null
    try
    {
    	 quote = iexTradingClient.executeRequest(new QuoteRequestBuilder().withSymbol(symbol).build());
    }
    catch
    {
      case e: Exception => e.printStackTrace
    }
    if (quote.getSymbol() == null) {
			throw new SymbolNotFoundException("Symbol not found: " + symbol);
    }
    
    return quote;
  }
  
  
  
  private def callIextradingQuotes(sybmols: Set[String]):  List[Quote]= {
    var quotes: List[Quote] = List()
    sybmols.foreach{
      symbol => ( quotes = callIextradingQuote(symbol) :: quotes)
    }
    return quotes
  }

  
  
  private def mapQuoteToStockQuote(quote: Quote): StockQuote= {
   
        val cal = Calendar.getInstance();
		cal.setTime(new Date(quote.getOpenTime()));
		val cal2 = Calendar.getInstance();
		cal2.setTime(new Date(quote.getOpenTime()));
		cal.set(Calendar.HOUR_OF_DAY, cal2.get(Calendar.HOUR_OF_DAY));
		cal.set(Calendar.MINUTE, cal2.get(Calendar.MINUTE));
		cal.set(Calendar.SECOND, cal2.get(Calendar.SECOND));
      val stockQuote = new StockQuote(quote.getCompanyName(),quote.getSymbol(),quote.getLatestPrice(),quote.getChange(),
                     quote.getChangePercent().floatValue(),cal.getTime(),quote.getMarketCap().floatValue(),quote.getLatestVolume().longValue()
                     ,quote.getHigh(),quote.getLow(),quote.getOpen());
    return stockQuote;
  }
}