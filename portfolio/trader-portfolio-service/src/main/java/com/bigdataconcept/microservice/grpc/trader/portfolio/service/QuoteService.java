package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import java.util.List;
import java.util.Set;

import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Quote;

public interface QuoteService {

	
	List<Quote> getMultipleQuotes(Set<String> symbols);
}
