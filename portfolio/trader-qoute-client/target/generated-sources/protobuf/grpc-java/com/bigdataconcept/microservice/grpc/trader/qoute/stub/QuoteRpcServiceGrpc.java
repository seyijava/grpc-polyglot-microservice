package com.bigdataconcept.microservice.grpc.trader.qoute.stub;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: qoute.proto")
public final class QuoteRpcServiceGrpc {

  private QuoteRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.bigdataconcept.microservice.grpc.trader.qoute.stub.QuoteRpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest,
      com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse> METHOD_GET_QUOTE =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest, com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.qoute.stub.QuoteRpcService", "getQuote"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse.getDefaultInstance()))
          .setSchemaDescriptor(new QuoteRpcServiceMethodDescriptorSupplier("getQuote"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuoteRpcServiceStub newStub(io.grpc.Channel channel) {
    return new QuoteRpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuoteRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QuoteRpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuoteRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QuoteRpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QuoteRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQuote(com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_QUOTE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_QUOTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest,
                com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse>(
                  this, METHODID_GET_QUOTE)))
          .build();
    }
  }

  /**
   */
  public static final class QuoteRpcServiceStub extends io.grpc.stub.AbstractStub<QuoteRpcServiceStub> {
    private QuoteRpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuoteRpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuoteRpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuoteRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getQuote(com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_QUOTE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QuoteRpcServiceBlockingStub extends io.grpc.stub.AbstractStub<QuoteRpcServiceBlockingStub> {
    private QuoteRpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuoteRpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuoteRpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuoteRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse getQuote(com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_QUOTE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QuoteRpcServiceFutureStub extends io.grpc.stub.AbstractStub<QuoteRpcServiceFutureStub> {
    private QuoteRpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuoteRpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuoteRpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuoteRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse> getQuote(
        com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_QUOTE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUOTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuoteRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuoteRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUOTE:
          serviceImpl.getQuote((com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.QuoteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QuoteRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuoteRpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bigdataconcept.microservice.grpc.trader.qoute.stub.Qoute.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuoteRpcService");
    }
  }

  private static final class QuoteRpcServiceFileDescriptorSupplier
      extends QuoteRpcServiceBaseDescriptorSupplier {
    QuoteRpcServiceFileDescriptorSupplier() {}
  }

  private static final class QuoteRpcServiceMethodDescriptorSupplier
      extends QuoteRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuoteRpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QuoteRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuoteRpcServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_QUOTE)
              .build();
        }
      }
    }
    return result;
  }
}
