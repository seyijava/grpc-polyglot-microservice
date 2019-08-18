package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Portfolio;

public interface PortfolioService {

	
	public String createOrder(Order order);
	
	public Portfolio getPortfolioByAccountId(String accountId);
	
	
	
}
