package com.bigdataconcept.microservice.grpc.trader.portfolio.config;

import org.lognet.springboot.grpc.GRpcGlobalInterceptor;
import org.springframework.beans.factory.annotation.Value;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.contrib.ActiveSpanSource;
import io.opentracing.contrib.ClientTracingInterceptor;
import io.opentracing.contrib.OpenTracingContextKey;
import io.opentracing.contrib.OperationNameConstructor;
import io.opentracing.contrib.ServerTracingInterceptor;
import io.opentracing.contrib.ServerTracingInterceptor.ServerRequestAttribute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bigdataconcept.microservice.grpc.trader.portfolio.service.AccountClient;
import com.bigdataconcept.microservice.grpc.trader.portfolio.service.QuoteClient;
import io.grpc.MethodDescriptor;
import io.jaegertracing.Configuration.ReporterConfiguration;
import io.jaegertracing.Configuration.SamplerConfiguration;
import io.jaegertracing.Configuration.SenderConfiguration;
import io.jaegertracing.internal.samplers.ProbabilisticSampler;



@Configuration
public class PortfolioConfig {

	@Value("${account.service.accountServiceHost:127.0.0.1}")
	private String accountServiceHost;
	
	@Value("${account.service.accountServicePort:6565}")
	private int accountServicePort;
	
	
	@Value("${qoute.service.QouteServiceHost:127.0.0.1}")
	private String qouteServiceHost;
	
	@Value("${qoute.service.QouteServicePort:6565}")
	private int qouteServicePort;
	

	@Value("${jargerEndpoint:http://localhost:9090}")
	private String jargerEndpoint;
	
	
	ClientTracingInterceptor interceptor;
	
	    @Bean
	    public AccountClient accountClient()
	    {
	    	
	    	 return new AccountClient(accountServiceHost,accountServicePort,gRPCClientTraceInterceptor("AccountClient"));
	    	 
	    }
	    
	    
	    @Bean
	    public QuoteClient quoteClient()
	    {
	    	
	    	 return new QuoteClient(qouteServiceHost,qouteServicePort, gRPCClientTraceInterceptor("QuoteClient"));
	    }
	    
	    
	   
	    public ClientTracingInterceptor gRPCClientTraceInterceptor(String clientName)
	    {
	    	 ClientTracingInterceptor tracingInterceptor = new ClientTracingInterceptor(tracer(clientName));
	     
	    	 return tracingInterceptor;
	    }
	    
	    
	    
	    @Bean
	    public Tracer portfolioTracer() {
	        SamplerConfiguration samplerConfiguration = new SamplerConfiguration();
	        ReporterConfiguration reporterConfiguration = new ReporterConfiguration();
	        SenderConfiguration senderConfiguration = new SenderConfiguration();

	        return new io.jaegertracing.Configuration("PortfolioService")
	                .withSampler(samplerConfiguration
	                        .withType(ProbabilisticSampler.TYPE)
	                        .withParam(1))
	                .withReporter(reporterConfiguration
	                        .withSender(senderConfiguration
	                                .withEndpoint(jargerEndpoint)))
	               
	                .getTracer();
	    }

	    
	   
	    private Tracer tracer(String tracerName) {
	        SamplerConfiguration samplerConfiguration = new SamplerConfiguration();
	        ReporterConfiguration reporterConfiguration = new ReporterConfiguration();
	        SenderConfiguration senderConfiguration = new SenderConfiguration();

	        return new io.jaegertracing.Configuration(tracerName)
	                .withSampler(samplerConfiguration
	                        .withType(ProbabilisticSampler.TYPE)
	                        .withParam(1))
	                .withReporter(reporterConfiguration
	                        .withSender(senderConfiguration
	                                .withEndpoint(jargerEndpoint)))
	               
	                .getTracer();
	    }

	    
	    @Bean
	    @GRpcGlobalInterceptor
	    public  ServerTracingInterceptor globalInterceptor()
	    {
	    	final Tracer tracer = tracer("PortfolioService");
	    	ServerTracingInterceptor tracingInterceptor = new ServerTracingInterceptor(tracer);
	    	return tracingInterceptor;
	    	
	    }
	    
	    
	    
	    
}
