package com.zhashut.shutapigateway.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: shut-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class shutApiGrpc {

  private shutApiGrpc() {}

  public static final String SERVICE_NAME = "shutApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Request,
      Response> getGetSecretKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecretKey",
      requestType = Request.class,
      responseType = Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Request,
      Response> getGetSecretKeyMethod() {
    io.grpc.MethodDescriptor<Request, Response> getGetSecretKeyMethod;
    if ((getGetSecretKeyMethod = shutApiGrpc.getGetSecretKeyMethod) == null) {
      synchronized (shutApiGrpc.class) {
        if ((getGetSecretKeyMethod = shutApiGrpc.getGetSecretKeyMethod) == null) {
          shutApiGrpc.getGetSecretKeyMethod = getGetSecretKeyMethod =
              io.grpc.MethodDescriptor.<Request, Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecretKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Response.getDefaultInstance()))
              .setSchemaDescriptor(new shutApiMethodDescriptorSupplier("GetSecretKey"))
              .build();
        }
      }
    }
    return getGetSecretKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static shutApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<shutApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<shutApiStub>() {
        @Override
        public shutApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new shutApiStub(channel, callOptions);
        }
      };
    return shutApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static shutApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<shutApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<shutApiBlockingStub>() {
        @Override
        public shutApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new shutApiBlockingStub(channel, callOptions);
        }
      };
    return shutApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static shutApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<shutApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<shutApiFutureStub>() {
        @Override
        public shutApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new shutApiFutureStub(channel, callOptions);
        }
      };
    return shutApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class shutApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSecretKey(Request request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretKeyMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSecretKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Request,
                Response>(
                  this, METHODID_GET_SECRET_KEY)))
          .build();
    }
  }

  /**
   */
  public static final class shutApiStub extends io.grpc.stub.AbstractAsyncStub<shutApiStub> {
    private shutApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected shutApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new shutApiStub(channel, callOptions);
    }

    /**
     */
    public void getSecretKey(Request request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class shutApiBlockingStub extends io.grpc.stub.AbstractBlockingStub<shutApiBlockingStub> {
    private shutApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected shutApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new shutApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public Response getSecretKey(Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class shutApiFutureStub extends io.grpc.stub.AbstractFutureStub<shutApiFutureStub> {
    private shutApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected shutApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new shutApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Response> getSecretKey(
        Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SECRET_KEY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final shutApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(shutApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SECRET_KEY:
          serviceImpl.getSecretKey((Request) request,
              (io.grpc.stub.StreamObserver<Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class shutApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    shutApiBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ShutApiProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("shutApi");
    }
  }

  private static final class shutApiFileDescriptorSupplier
      extends shutApiBaseDescriptorSupplier {
    shutApiFileDescriptorSupplier() {}
  }

  private static final class shutApiMethodDescriptorSupplier
      extends shutApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    shutApiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (shutApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new shutApiFileDescriptorSupplier())
              .addMethod(getGetSecretKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
