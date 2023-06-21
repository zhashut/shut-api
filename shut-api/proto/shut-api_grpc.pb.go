// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.8
// source: shut-api.proto

package proto

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// ShutApiClient is the client API for ShutApi service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ShutApiClient interface {
	GetSecretKey(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
}

type shutApiClient struct {
	cc grpc.ClientConnInterface
}

func NewShutApiClient(cc grpc.ClientConnInterface) ShutApiClient {
	return &shutApiClient{cc}
}

func (c *shutApiClient) GetSecretKey(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/shutApi/GetSecretKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ShutApiServer is the server API for ShutApi service.
// All implementations should embed UnimplementedShutApiServer
// for forward compatibility
type ShutApiServer interface {
	GetSecretKey(context.Context, *Request) (*Response, error)
}

// UnimplementedShutApiServer should be embedded to have forward compatible implementations.
type UnimplementedShutApiServer struct {
}

func (UnimplementedShutApiServer) GetSecretKey(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetSecretKey not implemented")
}

// UnsafeShutApiServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ShutApiServer will
// result in compilation errors.
type UnsafeShutApiServer interface {
	mustEmbedUnimplementedShutApiServer()
}

func RegisterShutApiServer(s grpc.ServiceRegistrar, srv ShutApiServer) {
	s.RegisterService(&ShutApi_ServiceDesc, srv)
}

func _ShutApi_GetSecretKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ShutApiServer).GetSecretKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shutApi/GetSecretKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ShutApiServer).GetSecretKey(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

// ShutApi_ServiceDesc is the grpc.ServiceDesc for ShutApi service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ShutApi_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "shutApi",
	HandlerType: (*ShutApiServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetSecretKey",
			Handler:    _ShutApi_GetSecretKey_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "shut-api.proto",
}