package com.bigdataconcept.microservice.grpc.trader.portfolio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order,Integer>{

	
	List<Order> findByAccountId(String accountId);
}
