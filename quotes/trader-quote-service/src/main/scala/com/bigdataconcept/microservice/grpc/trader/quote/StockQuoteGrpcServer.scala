package com.bigdataconcept.microservice.grpc.trader.quote

import  com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRpcServiceGrpc.QuoteRpcService
import com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest
import com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse
import io.grpc.{Server, ServerBuilder}
import scala.concurrent.{ExecutionContext, Future}
import  com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRpcServiceGrpc
import com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest
import com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse
import java.net.InetSocketAddress
import io.grpc.netty.NettyServerBuilder
import com.orbitz.consul.Consul
import com.orbitz.consul.AgentClient
import com.orbitz.consul.model.agent.ImmutableRegistration
import com.orbitz.consul.model.agent.Registration
import java.net.Inet4Address
import java.net.Inet4AddressImpl
import java.util.Collections
import com.google.common.net.HostAndPort;
import io.jaegertracing.Configuration.ReporterConfiguration;
import io.jaegertracing.Configuration.SamplerConfiguration;
import io.jaegertracing.Configuration.SenderConfiguration;
import io.jaegertracing.internal.samplers.ProbabilisticSampler;
import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.contrib.ServerTracingInterceptor
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import java.io.File
import com.typesafe.config.ConfigFactory
import com.typesafe.config.Config


 /**
  * @author Oluwaseyi Otun.
  * StockQuote Service is microservice that fetches stock quote from Yahoo Finances.
  * It implements gRPC services interface generated from proto  defined.
  */


object StockQuoteGrpcServer {
  
  def main(args : Array[String]) {
    BasicConfigurator.configure();
    val appHomePath = sys.env("APP_HOME")
    val configFile = new File(appHomePath + "/qouteService.conf")
    val config = ConfigFactory.parseFile(configFile).getConfig("appConfig")
    val server = new StockQuoteGrpcServer(ExecutionContext.global,config)
    server.start()
    server.blockUntilShutdown()
  
  }

  
    
}
  
  
  class StockQuoteGrpcServer(executionContext: ExecutionContext, config: Config) { self =>
    val log = Logger.getLogger(getClass.getName)
    private[this] var server: Server = null
    private def start(): Unit = {
    val tracer = getTracer(config.getString("tracer.jargerEndpointUrl"),"QouteService")
    val tracingInterceptor = new ServerTracingInterceptor(tracer);
    log.info("port\n" + config.getInt("qouteService.port"))
    server = NettyServerBuilder.forAddress(new InetSocketAddress(config.getString("qouteService.host"), config.getInt("qouteService.port"))).addService(tracingInterceptor.intercept(QuoteRpcServiceGrpc.bindService(new QuoteGrpcService, executionContext))).build.start
    consulServiceRegistration(config.getString("consul.host"),config.getInt("consul.port"),"qoute-service",config.getInt("qouteService.port"),config.getString("qouteService.host"))  
    log.info("StockQuoteGrpcServer Server started, listening on " + config.getInt("qouteService.port"))
    sys.addShutdownHook {
      log.info("*** shutting down gRPC server since JVM is shutting down")
      self.stop()
     log.info("*** server shut down")
    }
  }
    
    
    private def stop(): Unit = {
    if (server != null) {
      server.shutdown()
    }
  }

  private def blockUntilShutdown(): Unit = {
    if (server != null) {
      server.awaitTermination()
    }
  }
  
  
  
   private def consulServiceRegistration(consulIp: String, consulPort: Int, serviceName: String, servicePort: Int, serviceAddress: String): Unit = {
     
      val client = Consul.builder().withHostAndPort(HostAndPort.fromParts(consulIp, consulPort)).build();
      val agentClient = client.agentClient();
      val serviceId = "1";
      val service = ImmutableRegistration.builder()
        .id(serviceId)
        .name(serviceName)
        .port(servicePort)
        .address(serviceAddress)
        .check(Registration.RegCheck.ttl(3L)) // registers with a TTL of 3 seconds
        .tags(Collections.singletonList("tag1"))
        .meta(Collections.singletonMap("version", "1.0"))
        .build();
       agentClient.register(service);

   
  }
  
  
  private class QuoteGrpcService extends QuoteRpcService
  {
     val stockService = new StockQuoteService()
      override def getQuote(request: QuoteRequest)={
      val quote = stockService.getQuote(request.symbol)
      val qouteResponse =   QuoteResponse(name=quote.name,symbol=quote.symbol, lastPrice=quote.lastPrice.doubleValue, change=quote.change.doubleValue,
                changePercentage=quote.changePercent.doubleValue,marketCap=quote.marketCap.longValue,volume=quote.volume.longValue,
                low=quote.low.doubleValue,high=quote.high.doubleValue,open=quote.open.doubleValue) 
                Future.successful(qouteResponse)
   }
     
    override def getQuotes(request: QuotesRequest)={
        val symboleArrays = new Array[String](request.symbol.length)         
        request.symbol.map(symbol => symboleArrays +:symbol)
        val stockQuotes = stockService.getQuotes(symboleArrays)   
        val qoutesResponse = new QoutesResponse();
       stockQuotes.map(quote => { val quoteResponse=
            QuoteResponse(name=quote.name,symbol=quote.symbol, lastPrice=quote.lastPrice.doubleValue, change=quote.change.doubleValue,
                changePercentage=quote.changePercent.doubleValue,marketCap=quote.marketCap.longValue,volume=quote.volume.longValue,
                low=quote.low.doubleValue,high=quote.high.doubleValue,open=quote.open.doubleValue) 
               qoutesResponse.addQuoutesResponse(quoteResponse)  
           }       
            )
        Future.successful(qoutesResponse)
     }
    
  }
  
   def  getTracer(jargerEndpoint: String,serviceName: String) : Tracer = {
   val samplerConfiguration = new SamplerConfiguration();
   val reporterConfiguration = new ReporterConfiguration();
   val  senderConfiguration = new SenderConfiguration();
   val tracer = new io.jaegertracing.Configuration(serviceName)
	                        .withSampler(samplerConfiguration
	                        .withType(ProbabilisticSampler.TYPE)
	                        .withParam(1))
	                        .withReporter(reporterConfiguration
	                        .withSender(senderConfiguration
	                        .withEndpoint(jargerEndpoint)))
	                        .getTracer();
     return tracer;
  }
}
