package com.bigdataconcept.microservice.grpc.trader.quote.stub

object QuoteRpcServiceGrpc {
  val METHOD_GET_QUOTE: _root_.io.grpc.MethodDescriptor[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("com.bigdataconcept.microservice.grpc.trader.quote.QuoteRpcService", "getQuote"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse])
      .build()
  
  val METHOD_GET_QUOTES: _root_.io.grpc.MethodDescriptor[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest, com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("com.bigdataconcept.microservice.grpc.trader.quote.QuoteRpcService", "getQuotes"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse])
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("com.bigdataconcept.microservice.grpc.trader.quote.QuoteRpcService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(com.bigdataconcept.microservice.grpc.trader.quote.stub.StubProto.javaDescriptor))
      .addMethod(METHOD_GET_QUOTE)
      .addMethod(METHOD_GET_QUOTES)
      .build()
  
  trait QuoteRpcService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = QuoteRpcService
    def getQuote(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest): scala.concurrent.Future[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]
    def getQuotes(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest): scala.concurrent.Future[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse]
  }
  
  object QuoteRpcService extends _root_.scalapb.grpc.ServiceCompanion[QuoteRpcService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[QuoteRpcService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.bigdataconcept.microservice.grpc.trader.quote.stub.StubProto.javaDescriptor.getServices().get(0)
  }
  
  trait QuoteRpcServiceBlockingClient {
    def serviceCompanion = QuoteRpcService
    def getQuote(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse
    def getQuotes(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest): com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse
  }
  
  class QuoteRpcServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[QuoteRpcServiceBlockingStub](channel, options) with QuoteRpcServiceBlockingClient {
    override def getQuote(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_QUOTE, options, request)
    }
    
    override def getQuotes(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest): com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_QUOTES, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): QuoteRpcServiceBlockingStub = new QuoteRpcServiceBlockingStub(channel, options)
  }
  
  class QuoteRpcServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[QuoteRpcServiceStub](channel, options) with QuoteRpcService {
    override def getQuote(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest): scala.concurrent.Future[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_QUOTE, options, request)
    }
    
    override def getQuotes(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest): scala.concurrent.Future[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_QUOTES, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): QuoteRpcServiceStub = new QuoteRpcServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: QuoteRpcService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_GET_QUOTE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] {
        override def invoke(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest, observer: _root_.io.grpc.stub.StreamObserver[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]): Unit =
          serviceImpl.getQuote(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_QUOTES,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest, com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] {
        override def invoke(request: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest, observer: _root_.io.grpc.stub.StreamObserver[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse]): Unit =
          serviceImpl.getQuotes(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): QuoteRpcServiceBlockingStub = new QuoteRpcServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): QuoteRpcServiceStub = new QuoteRpcServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.bigdataconcept.microservice.grpc.trader.quote.stub.StubProto.javaDescriptor.getServices().get(0)
  
}