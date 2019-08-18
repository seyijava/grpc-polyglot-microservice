package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Map;
import java.util.stream.Collectors;

import org.lognet.springboot.grpc.GRpcGlobalInterceptor;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.PortfolioServiceGrpc.PortfolioServiceImplBase;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.PortfolioRequest;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.PortfolioResponse;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.OrderRequest;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.OrderResponse;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Portfolio;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Holding;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.OrderType;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Date;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Holdings;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Order;

/** 
 * 
 * @author Oluwasey Otun
 *  
 *  This service is implemented using gRPC in Java . It responsible for managing portfolios 
 */
@GRpcService
public class PortfolioServiceGrpc extends PortfolioServiceImplBase{

	
	
	@Autowired
	PortfolioService portfolioService;
	
	
    @Override
    public void getPortfolio(PortfolioRequest request,io.grpc.stub.StreamObserver<PortfolioResponse> responseObserver) {
   com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Portfolio portfolio  = this.portfolioService.getPortfolioByAccountId(request.getAccountId());
    Portfolio portfolioHoldings =  this.createPortfolioHoldings(portfolio);
    
    PortfolioResponse portfolioResponse = PortfolioResponse.newBuilder()
    		                             .setPortfolio(portfolioHoldings).build();
    
    responseObserver.onNext(portfolioResponse);
    responseObserver.onCompleted();
   
    }

    @Override
    public void createOrder(OrderRequest request, io.grpc.stub.StreamObserver<OrderResponse> responseObserver) {
       Order order =  request.getOrder();
       String orderNumber = portfolioService.createOrder(createOrder(order));
       OrderResponse orderResponse = OrderResponse.newBuilder()
    		                          .setOrderNumber(orderNumber)
    		                          .setAccountId(request.getAccountId())
    		                          .build();
       
       responseObserver.onNext(orderResponse);
       responseObserver.onCompleted();
    }

    
    private com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order createOrder(Order orderRequest)
    {
    	com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order order = com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order
    			                                                                           .builder()
    			                                                                       .price(new BigDecimal(orderRequest.getPrice()))
    			                                                                       .symbol(orderRequest.getSymbol())
    			                                                                       .quantity(orderRequest.getQuantity())
    			                                                                       .orderType(orderRequest.getOrdertype().ordinal() == 0 ? OrderType.BUY: OrderType.SELL)
    			                                                                       .orderDate(new java.util.Date())
    			                                                                       .build();
    			                                                                    		  
    			                                                                      
    	return order;
    }
    
    
    private Portfolio createPortfolioHoldings(com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Portfolio portfolioDetails)
    {
    	Portfolio portfolio = Portfolio.newBuilder().build();
    	
    	portfolio = createHoldings(portfolioDetails.getHoldings(),portfolio);
    	
    	return portfolio;
    }
    
    
   
	private Portfolio createHoldings(Map<String, Holding> holdingsDetails, Portfolio portfolio)
    {
    	for(String key : holdingsDetails.keySet())
    	{
    	  Holding holding = 	holdingsDetails.get(key);
    	  Holdings  holdings = Holdings.newBuilder()
    			               .setQuantity(holding.getQuantity())
    			               .setSymbol(key)
    			               .setSellValue(holding.getSellValue().doubleValue())
    			               .setBuyValue(holding.getPurchaseValue().doubleValue())
    			               .setCurrentValue(holding.getCurrentValue().doubleValue())
    			               .addAllOrders(holding.getOrders().stream().map(this::createOrder).collect(Collectors.toList()))
    			               .build();
    	  portfolio.getHoldingsMap().put(key, holdings);
    	}
        
    	return null;
    }

	
	private Order createOrder(com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order orderDetails)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(orderDetails.getCompletionDate());
		Order order = Order.newBuilder()
				      .setAccountId(orderDetails.getAccountId())
				      .setOrderFee(orderDetails.getOrderFee().doubleValue())
				      .setQuantity(orderDetails.getQuantity())
				      .setPrice(orderDetails.getPrice().doubleValue())
				      .setSymbol(orderDetails.getSymbol())
				      .setOrdertype(orderDetails.getOrderType().ordinal() == 0 ? com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Order.Ordertype.BUY: com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Order.Ordertype.SELL)
				      .setCompletiondate( Date.newBuilder()
				    		  .setDay(cal.get(Calendar.DAY_OF_MONTH))
				    		  .setMonth(cal.get(Calendar.MONTH))
				            .setYear(cal.get(Calendar.YEAR)).build())
				      .build();
		return order;
	}
	
	
}
