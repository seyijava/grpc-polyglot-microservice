package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import java.math.BigDecimal;

public interface AccountService {

	
	boolean decreaseBalance(double amount, String accountId);
	
	
	boolean increaseBalance(double amount, String accountId);
}
