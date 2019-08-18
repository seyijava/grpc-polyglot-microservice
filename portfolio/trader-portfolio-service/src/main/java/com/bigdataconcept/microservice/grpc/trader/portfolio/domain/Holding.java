package com.bigdataconcept.microservice.grpc.trader.portfolio.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Holding implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String symbol;
	private Integer quantity = 0;
	private BigDecimal purchaseValue = BigDecimal.ZERO;
	private BigDecimal sellValue = BigDecimal.ZERO;
	private Set<Order> orders = new HashSet<>();
	private BigDecimal currentValue = BigDecimal.ZERO;
	
	
	
	

	public void addOrder(Order order) {
		// check order is not already in.
		if (orders.contains(order)) {
			// TODO: throw RuntimeException?? and do nothing;
		} else {
			orders.add(order);
			// update stats
			if (order.getOrderType().equals(OrderType.BUY)) {
				setQuantity(getQuantity() + order.getQuantity());
				setPurchaseValue(getPurchaseValue().add(order.getPrice().multiply(new BigDecimal(order.getQuantity()))));
			} else if (order.getOrderType().equals(OrderType.SELL)) {
				setQuantity(getQuantity() - order.getQuantity());
				setSellValue(getSellValue().add(order.getPrice().multiply(new BigDecimal(order.getQuantity()))));
			}
		}
	}

}
