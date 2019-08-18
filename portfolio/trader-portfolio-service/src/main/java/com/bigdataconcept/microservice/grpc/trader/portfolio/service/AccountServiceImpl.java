package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	private AccountClient accountClient;
	
	@Override
	public boolean decreaseBalance(double amount, String accountId) {
		// TODO Auto-generated method stub
		
		return accountClient.deposit(amount, accountId);
		
	}

	@Override
	public boolean increaseBalance(double amount, String accountId) {
		// TODO Auto-generated method stub
		return accountClient.withdraw(amount, accountId);
		
		
	}

}
