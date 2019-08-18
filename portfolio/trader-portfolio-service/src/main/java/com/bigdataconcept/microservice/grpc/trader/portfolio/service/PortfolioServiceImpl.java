package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Order;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Portfolio;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Quote;
import com.bigdataconcept.microservice.grpc.trader.portfolio.repository.OrderRepository;
import com.bigdataconcept.microservice.grpc.trader.portfolio.stub.Order.Ordertype;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Holding;


@Service
public class PortfolioServiceImpl implements PortfolioService {


	private static final Logger logger = LoggerFactory.getLogger(PortfolioServiceImpl.class);
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private QuoteService quoteService;
	
	
	@Autowired
	private AccountService accountService;
	
	
	@Override
	public String createOrder(Order order) {
		// TODO Auto-generated method stub
		boolean executed = false;
		logger.debug("Adding order: " + order);
		if (order.getOrderFee() == null) {
			order.setOrderFee(Order.DEFAULT_ORDER_FEE);
			logger.debug("Adding Fee to order: " + order);
		}
		if (order.getOrderType().equals(Ordertype.BUY)) {
			double amount = order.getQuantity()
					* order.getPrice().doubleValue()
					+ order.getOrderFee().doubleValue();
			
		  executed =	accountService.decreaseBalance(amount, order.getAccountId());
			if (executed) {
				logger.info(String
						.format("Account funds updated successfully for account: %s ",
								order.getAccountId()));
				 orderRepository.save(order);
			} else {
				// TODO: throw exception - not enough funds!
				// SK - Whats the expected behaviour?
				logger.warn("PortfolioService:addOrder - decrease balance GRPC not ok: ");
				return null;
			}
		}
		
		else {
			double amount = order.getQuantity()
					* order.getPrice().doubleValue()
					- order.getOrderFee().doubleValue();
			
			executed = this.accountService.increaseBalance(amount, order.getAccountId());
			if (executed) {
				logger.info(String
						.format("Account funds updated successfully for account: %s ",
								order.getAccountId()));
				 orderRepository.save(order);
			} else {
				// TODO: throw exception - negative value???
				logger.warn("PortfolioService:addOrder - increase balance GRPC not ok: ");
				return null;
			}
		}

		return null;
	}

	@Override
	public Portfolio getPortfolioByAccountId(String accountId) {
		
		logger.debug("Getting portfolio for accountId: " + accountId);
		List<Order> orders = orderRepository.findByAccountId(accountId);
		Portfolio folio = new Portfolio();
		folio.setAccountId(accountId);
		return createPortfolio(folio, orders);
		
	}
	
	
	
	private Portfolio createPortfolio(Portfolio portfolio, List<Order> orders) {
		// TODO: change to forEach() and maybe in parallel?
		Set<String> symbols = new HashSet<>();
		Holding holding = null;
		for (Order order : orders) {
			holding = portfolio.getHolding(order.getSymbol());
			if (holding == null) {
				holding = new Holding();
				holding.setSymbol(order.getSymbol());
				portfolio.addHolding(holding);
				symbols.add(order.getSymbol());
			}
			holding.addOrder(order);
		}
		
		List<Quote> quotes = quoteService.getMultipleQuotes(symbols);

		for (Quote quote : quotes) {
			portfolio.getHolding(quote.getSymbol()).setCurrentValue(quote.getLastPrice());
		}
		portfolio.refreshTotalValue();
		logger.debug("Portfolio: " + portfolio);
		return portfolio;
	}


}
