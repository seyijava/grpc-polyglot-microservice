package com.bigdataconcept.microservice.grpc.trader.portfolio.domain;


public enum OrderType {

	BUY("BUY"),SELL("SELL");
	
	private String orderType;
	
	OrderType(String orderType)
	{
		this.orderType = orderType;
	}
	
	
}
