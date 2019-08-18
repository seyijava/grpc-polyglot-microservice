package com.bigdataconcept.microservice.grpc.trader.account.stub;

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
    comments = "Source: account.proto")
public final class AccountRpcServiceGrpc {

  private AccountRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse> METHOD_ADD_ACCOUNT =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "addAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("addAccount"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse> METHOD_ADD_CREDIT_CARD =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "addCreditCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("addCreditCard"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse> METHOD_UPDATE_ADDRESS =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "updateAddress"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("updateAddress"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse> METHOD_UPDATE_PROFILE =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "updateProfile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("updateProfile"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse> METHOD_GET_ACCOUNT_BALANCE =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "getAccountBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("getAccountBalance"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse> METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "getAllCreditCardsByAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("getAllCreditCardsByAccount"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse> METHOD_GET_PROFILE_BY_ACCOUNT =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "getProfileByAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("getProfileByAccount"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse> METHOD_DEPOSIT =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "deposit"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("deposit"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest,
      com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse> METHOD_WITHDRAW =
      io.grpc.MethodDescriptor.<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest, com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bigdataconcept.microservice.grpc.trader.account.stub.AccountRpcService", "withdraw"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse.getDefaultInstance()))
          .setSchemaDescriptor(new AccountRpcServiceMethodDescriptorSupplier("withdraw"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountRpcServiceStub newStub(io.grpc.Channel channel) {
    return new AccountRpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountRpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountRpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_ACCOUNT, responseObserver);
    }

    /**
     */
    public void addCreditCard(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_CREDIT_CARD, responseObserver);
    }

    /**
     */
    public void updateAddress(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ADDRESS, responseObserver);
    }

    /**
     */
    public void updateProfile(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PROFILE, responseObserver);
    }

    /**
     */
    public void getAccountBalance(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACCOUNT_BALANCE, responseObserver);
    }

    /**
     */
    public void getAllCreditCardsByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT, responseObserver);
    }

    /**
     */
    public void getProfileByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROFILE_BY_ACCOUNT, responseObserver);
    }

    /**
     */
    public void deposit(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEPOSIT, responseObserver);
    }

    /**
     */
    public void withdraw(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_WITHDRAW, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse>(
                  this, METHODID_ADD_ACCOUNT)))
          .addMethod(
            METHOD_ADD_CREDIT_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse>(
                  this, METHODID_ADD_CREDIT_CARD)))
          .addMethod(
            METHOD_UPDATE_ADDRESS,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            METHOD_UPDATE_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            METHOD_GET_ACCOUNT_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse>(
                  this, METHODID_GET_ACCOUNT_BALANCE)))
          .addMethod(
            METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse>(
                  this, METHODID_GET_ALL_CREDIT_CARDS_BY_ACCOUNT)))
          .addMethod(
            METHOD_GET_PROFILE_BY_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse>(
                  this, METHODID_GET_PROFILE_BY_ACCOUNT)))
          .addMethod(
            METHOD_DEPOSIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            METHOD_WITHDRAW,
            asyncUnaryCall(
              new MethodHandlers<
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest,
                com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .build();
    }
  }

  /**
   */
  public static final class AccountRpcServiceStub extends io.grpc.stub.AbstractStub<AccountRpcServiceStub> {
    private AccountRpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountRpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCreditCard(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_CREDIT_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADDRESS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROFILE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountBalance(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_BALANCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCreditCardsByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfileByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE_BY_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposit(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEPOSIT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WITHDRAW, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountRpcServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountRpcServiceBlockingStub> {
    private AccountRpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountRpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse addAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_ACCOUNT, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse addCreditCard(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_CREDIT_CARD, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse updateAddress(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ADDRESS, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse updateProfile(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PROFILE, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse getAccountBalance(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCOUNT_BALANCE, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse getAllCreditCardsByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse getProfileByAccount(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROFILE_BY_ACCOUNT, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse deposit(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEPOSIT, getCallOptions(), request);
    }

    /**
     */
    public com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse withdraw(com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WITHDRAW, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountRpcServiceFutureStub extends io.grpc.stub.AbstractStub<AccountRpcServiceFutureStub> {
    private AccountRpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountRpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse> addAccount(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_ACCOUNT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse> addCreditCard(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_CREDIT_CARD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse> updateAddress(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADDRESS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse> updateProfile(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROFILE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse> getAccountBalance(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_BALANCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse> getAllCreditCardsByAccount(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse> getProfileByAccount(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE_BY_ACCOUNT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse> deposit(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEPOSIT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse> withdraw(
        com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WITHDRAW, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ACCOUNT = 0;
  private static final int METHODID_ADD_CREDIT_CARD = 1;
  private static final int METHODID_UPDATE_ADDRESS = 2;
  private static final int METHODID_UPDATE_PROFILE = 3;
  private static final int METHODID_GET_ACCOUNT_BALANCE = 4;
  private static final int METHODID_GET_ALL_CREDIT_CARDS_BY_ACCOUNT = 5;
  private static final int METHODID_GET_PROFILE_BY_ACCOUNT = 6;
  private static final int METHODID_DEPOSIT = 7;
  private static final int METHODID_WITHDRAW = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ACCOUNT:
          serviceImpl.addAccount((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddAccountReponse>) responseObserver);
          break;
        case METHODID_ADD_CREDIT_CARD:
          serviceImpl.addCreditCard((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddCreditCardResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddresssUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.AddressUpdateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileUpdateResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BALANCE:
          serviceImpl.getAccountBalance((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.BalanceResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CREDIT_CARDS_BY_ACCOUNT:
          serviceImpl.getAllCreditCardsByAccount((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.CreditCardsResponse>) responseObserver);
          break;
        case METHODID_GET_PROFILE_BY_ACCOUNT:
          serviceImpl.getProfileByAccount((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.ProfileResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.DepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.bigdataconcept.microservice.grpc.trader.account.stub.Account.WithdrawResponse>) responseObserver);
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

  private static abstract class AccountRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountRpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bigdataconcept.microservice.grpc.trader.account.stub.Account.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountRpcService");
    }
  }

  private static final class AccountRpcServiceFileDescriptorSupplier
      extends AccountRpcServiceBaseDescriptorSupplier {
    AccountRpcServiceFileDescriptorSupplier() {}
  }

  private static final class AccountRpcServiceMethodDescriptorSupplier
      extends AccountRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountRpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountRpcServiceFileDescriptorSupplier())
              .addMethod(METHOD_ADD_ACCOUNT)
              .addMethod(METHOD_ADD_CREDIT_CARD)
              .addMethod(METHOD_UPDATE_ADDRESS)
              .addMethod(METHOD_UPDATE_PROFILE)
              .addMethod(METHOD_GET_ACCOUNT_BALANCE)
              .addMethod(METHOD_GET_ALL_CREDIT_CARDS_BY_ACCOUNT)
              .addMethod(METHOD_GET_PROFILE_BY_ACCOUNT)
              .addMethod(METHOD_DEPOSIT)
              .addMethod(METHOD_WITHDRAW)
              .build();
        }
      }
    }
    return result;
  }
}
