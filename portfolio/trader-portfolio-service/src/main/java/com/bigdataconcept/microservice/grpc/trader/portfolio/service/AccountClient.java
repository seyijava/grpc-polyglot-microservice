package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest;
import com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse;
import com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest;
import com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse;
import com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcServiceGrpc;
import com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcServiceGrpc.AccountRpcServiceBlockingStub;
import com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcServiceGrpc.AccountRpcServiceStub;

import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.opentracing.contrib.ClientTracingInterceptor;

public class AccountClient {

	
	 private static final Logger LOG = LoggerFactory.getLogger(AccountClient.class);
	 
	 private final ManagedChannel channel;
	 
	 private final AccountRpcServiceBlockingStub blockingStub;
	 
	 private final AccountRpcServiceStub asyncStub;
	 
	 public AccountClient(String host, int port,ClientTracingInterceptor qouteTraceClientInterceptor) {
		 
		    this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true),qouteTraceClientInterceptor);
		    LOG.info(String.format("Account Client initiziation using AccountService Host[%s], Port[%d]", host,port));
		  }

   private AccountClient(ManagedChannelBuilder<?> channelBuilder,ClientTracingInterceptor qouteTraceClientInterceptor) {
		    channel = channelBuilder.build();
		      blockingStub = AccountRpcServiceGrpc.newBlockingStub(ClientInterceptors.intercept(channel, qouteTraceClientInterceptor));
		      asyncStub = AccountRpcServiceGrpc.newStub(ClientInterceptors.intercept(channel, qouteTraceClientInterceptor));
		      
		    
	}
   
   
   

 
   public boolean deposit(double amount, String accountId)
   {
	    DepositRequest depositRequest = DepositRequest.newBuilder()
	    		                        .setAmount(amount)
	    		                        .setAccountId(accountId).build();
	    DepositResponse response = this.blockingStub.deposit(depositRequest);
	    return response.getStatus();
   
   }

  
   public boolean withdraw(double amount, String accountId)
   {
       WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder()
    		                             .setAmount(amount)
    		                             .setAccountId(accountId).build();
       WithdrawResponse response = this.blockingStub.withdraw(withdrawRequest);
       return response.getStatus();
   }
}
