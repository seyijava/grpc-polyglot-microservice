package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Quote;


@Service
public class QuoteServiceImpl implements QuoteService {

	
	@Autowired
	QuoteClient quoteClient;
	
	@Override
	public List<Quote> getMultipleQuotes(Set<String> symbols) {
		// TODO Auto-generated method stub
		List<Quote> quotes = new ArrayList<Quote>();
		for(String symbol: symbols)
		{
			quotes.add(this.quoteClient.getQuote(symbol));
		}
		return quotes;
	}

}
