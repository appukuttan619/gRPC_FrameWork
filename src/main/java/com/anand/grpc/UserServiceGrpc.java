package com.anand.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Defining a Service, a Service can have multiple RPC operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: UserService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.anand.grpc.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.AddUserRequest,
      com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.anand.grpc.UserServiceOuterClass.AddUserRequest.class,
      responseType = com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.AddUserRequest,
      com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.AddUserRequest, com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> getAddUserMethod;
    if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
          UserServiceGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<com.anand.grpc.UserServiceOuterClass.AddUserRequest, com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.anand.grpc.UserService", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
      com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUser",
      requestType = com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.class,
      responseType = com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
      com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest, com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserMethod;
    if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
          UserServiceGrpc.getGetAllUserMethod = getGetAllUserMethod = 
              io.grpc.MethodDescriptor.<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest, com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.anand.grpc.UserService", "getAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getAllUser"))
                  .build();
          }
        }
     }
     return getGetAllUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
      com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserWithStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUserWithStream",
      requestType = com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.class,
      responseType = com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
      com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserWithStreamMethod() {
    io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest, com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getGetAllUserWithStreamMethod;
    if ((getGetAllUserWithStreamMethod = UserServiceGrpc.getGetAllUserWithStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserWithStreamMethod = UserServiceGrpc.getGetAllUserWithStreamMethod) == null) {
          UserServiceGrpc.getGetAllUserWithStreamMethod = getGetAllUserWithStreamMethod = 
              io.grpc.MethodDescriptor.<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest, com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.anand.grpc.UserService", "getAllUserWithStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getAllUserWithStream"))
                  .build();
          }
        }
     }
     return getGetAllUserWithStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest,
      com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserById",
      requestType = com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.class,
      responseType = com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest,
      com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest, com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
          UserServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest, com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.anand.grpc.UserService", "getUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserById"))
                  .build();
          }
        }
     }
     return getGetUserByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void addUser(com.anand.grpc.UserServiceOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void getAllUser(com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    /**
     */
    public void getAllUserWithStream(com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserWithStreamMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anand.grpc.UserServiceOuterClass.AddUserRequest,
                com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getGetAllUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
                com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>(
                  this, METHODID_GET_ALL_USER)))
          .addMethod(
            getGetAllUserWithStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.anand.grpc.UserServiceOuterClass.GetAllUserRequest,
                com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>(
                  this, METHODID_GET_ALL_USER_WITH_STREAM)))
          .addMethod(
            getGetUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest,
                com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response>(
                  this, METHODID_GET_USER_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void addUser(com.anand.grpc.UserServiceOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUser(com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUserWithStream(com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllUserWithStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest request,
        io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response addUser(com.anand.grpc.UserServiceOuterClass.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response getAllUser(com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getAllUserWithStream(
        com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllUserWithStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response getUserById(com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response> addUser(
        com.anand.grpc.UserServiceOuterClass.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response> getAllUser(
        com.anand.grpc.UserServiceOuterClass.GetAllUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response> getUserById(
        com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_GET_ALL_USER = 1;
  private static final int METHODID_GET_ALL_USER_WITH_STREAM = 2;
  private static final int METHODID_GET_USER_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.anand.grpc.UserServiceOuterClass.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.AddUserRequest.Response>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((com.anand.grpc.UserServiceOuterClass.GetAllUserRequest) request,
              (io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_WITH_STREAM:
          serviceImpl.getAllUserWithStream((com.anand.grpc.UserServiceOuterClass.GetAllUserRequest) request,
              (io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetAllUserRequest.Response>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.anand.grpc.UserServiceOuterClass.GetUserByIdRequest.Response>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anand.grpc.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getGetAllUserMethod())
              .addMethod(getGetAllUserWithStreamMethod())
              .addMethod(getGetUserByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
