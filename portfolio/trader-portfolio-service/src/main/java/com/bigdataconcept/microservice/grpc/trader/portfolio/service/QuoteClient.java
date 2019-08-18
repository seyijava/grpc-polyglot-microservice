package com.bigdataconcept.microservice.grpc.trader.portfolio.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bigdataconcept.microservice.grpc.trader.portfolio.domain.Quote;
import com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest;
import com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse;
import com.bigdataconcept.microservice.grpc.trader.qoute.stub.QuoteRpcServiceGrpc;
import com.bigdataconcept.microservice.grpc.trader.qoute.stub.QuoteRpcServiceGrpc.QuoteRpcServiceBlockingStub;
import com.bigdataconcept.microservice.grpc.trader.qoute.stub.QuoteRpcServiceGrpc.QuoteRpcServiceStub;

import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.opentracing.contrib.ClientTracingInterceptor;

public class QuoteClient {

	
 private static final Logger LOG = LoggerFactory.getLogger(QuoteClient.class);
	 
	 private final ManagedChannel channel;
	 

	 private final QuoteRpcServiceBlockingStub blockingStub;
	 
	 private final QuoteRpcServiceStub asyncStub;
	 
	 
	 
	
	 
	 
	 public QuoteClient(String host, int port,ClientTracingInterceptor qouteTraceClientInterceptor) {
		 
		    this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true),qouteTraceClientInterceptor);
		    LOG.info(String.format("QuoteClient Client initiziation using QuoteRpcService Host[%s], Port[%d]", host,port));
		  }

private QuoteClient(ManagedChannelBuilder<?> channelBuilder,ClientTracingInterceptor qouteTraceClientInterceptor) {
		    channel = channelBuilder.build();
		      blockingStub = QuoteRpcServiceGrpc.newBlockingStub(ClientInterceptors.intercept(channel, qouteTraceClientInterceptor));
		      asyncStub = QuoteRpcServiceGrpc.newStub(ClientInterceptors.intercept(channel, qouteTraceClientInterceptor));
		      
		    
	}

   
    public Quote getQuote(String symbol)
    {
    	QuoteRequest qouteRequest = QuoteRequest
    			                     .newBuilder().setSymbol(symbol).build();
       QuoteResponse quoteResponse =	this.blockingStub.getQuote(qouteRequest);
    	return buildQuote(quoteResponse);
    }

    
     private Quote buildQuote(QuoteResponse quoteResponse)
     {
    	 return null;
     }

}
