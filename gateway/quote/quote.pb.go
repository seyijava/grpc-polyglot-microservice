// Code generated by protoc-gen-go. DO NOT EDIT.
// source: quote.proto

package quote

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type QuoteRequest struct {
	Symbol               string   `protobuf:"bytes,1,opt,name=symbol,proto3" json:"symbol,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *QuoteRequest) Reset()         { *m = QuoteRequest{} }
func (m *QuoteRequest) String() string { return proto.CompactTextString(m) }
func (*QuoteRequest) ProtoMessage()    {}
func (*QuoteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_12e4b46109c2c385, []int{0}
}

func (m *QuoteRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_QuoteRequest.Unmarshal(m, b)
}
func (m *QuoteRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_QuoteRequest.Marshal(b, m, deterministic)
}
func (m *QuoteRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QuoteRequest.Merge(m, src)
}
func (m *QuoteRequest) XXX_Size() int {
	return xxx_messageInfo_QuoteRequest.Size(m)
}
func (m *QuoteRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QuoteRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QuoteRequest proto.InternalMessageInfo

func (m *QuoteRequest) GetSymbol() string {
	if m != nil {
		return m.Symbol
	}
	return ""
}

type QuotesRequest struct {
	Symbol               []string `protobuf:"bytes,1,rep,name=symbol,proto3" json:"symbol,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *QuotesRequest) Reset()         { *m = QuotesRequest{} }
func (m *QuotesRequest) String() string { return proto.CompactTextString(m) }
func (*QuotesRequest) ProtoMessage()    {}
func (*QuotesRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_12e4b46109c2c385, []int{1}
}

func (m *QuotesRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_QuotesRequest.Unmarshal(m, b)
}
func (m *QuotesRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_QuotesRequest.Marshal(b, m, deterministic)
}
func (m *QuotesRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QuotesRequest.Merge(m, src)
}
func (m *QuotesRequest) XXX_Size() int {
	return xxx_messageInfo_QuotesRequest.Size(m)
}
func (m *QuotesRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_QuotesRequest.DiscardUnknown(m)
}

var xxx_messageInfo_QuotesRequest proto.InternalMessageInfo

func (m *QuotesRequest) GetSymbol() []string {
	if m != nil {
		return m.Symbol
	}
	return nil
}

type QoutesResponse struct {
	QuoutesResponse      []*QuoteResponse `protobuf:"bytes,1,rep,name=quoutesResponse,proto3" json:"quoutesResponse,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *QoutesResponse) Reset()         { *m = QoutesResponse{} }
func (m *QoutesResponse) String() string { return proto.CompactTextString(m) }
func (*QoutesResponse) ProtoMessage()    {}
func (*QoutesResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_12e4b46109c2c385, []int{2}
}

func (m *QoutesResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_QoutesResponse.Unmarshal(m, b)
}
func (m *QoutesResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_QoutesResponse.Marshal(b, m, deterministic)
}
func (m *QoutesResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QoutesResponse.Merge(m, src)
}
func (m *QoutesResponse) XXX_Size() int {
	return xxx_messageInfo_QoutesResponse.Size(m)
}
func (m *QoutesResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QoutesResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QoutesResponse proto.InternalMessageInfo

func (m *QoutesResponse) GetQuoutesResponse() []*QuoteResponse {
	if m != nil {
		return m.QuoutesResponse
	}
	return nil
}

type QuoteResponse struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Symbol               string   `protobuf:"bytes,2,opt,name=symbol,proto3" json:"symbol,omitempty"`
	LastPrice            float64  `protobuf:"fixed64,3,opt,name=lastPrice,proto3" json:"lastPrice,omitempty"`
	Change               float64  `protobuf:"fixed64,4,opt,name=change,proto3" json:"change,omitempty"`
	ChangePercentage     float64  `protobuf:"fixed64,5,opt,name=changePercentage,proto3" json:"changePercentage,omitempty"`
	MarketCap            int64    `protobuf:"varint,6,opt,name=marketCap,proto3" json:"marketCap,omitempty"`
	Volume               int64    `protobuf:"varint,7,opt,name=volume,proto3" json:"volume,omitempty"`
	ChangeYTD            float64  `protobuf:"fixed64,8,opt,name=changeYTD,proto3" json:"changeYTD,omitempty"`
	ChangePercentageYTD  float64  `protobuf:"fixed64,9,opt,name=changePercentageYTD,proto3" json:"changePercentageYTD,omitempty"`
	Low                  float64  `protobuf:"fixed64,10,opt,name=low,proto3" json:"low,omitempty"`
	High                 float64  `protobuf:"fixed64,11,opt,name=high,proto3" json:"high,omitempty"`
	Open                 float64  `protobuf:"fixed64,12,opt,name=open,proto3" json:"open,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *QuoteResponse) Reset()         { *m = QuoteResponse{} }
func (m *QuoteResponse) String() string { return proto.CompactTextString(m) }
func (*QuoteResponse) ProtoMessage()    {}
func (*QuoteResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_12e4b46109c2c385, []int{3}
}

func (m *QuoteResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_QuoteResponse.Unmarshal(m, b)
}
func (m *QuoteResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_QuoteResponse.Marshal(b, m, deterministic)
}
func (m *QuoteResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_QuoteResponse.Merge(m, src)
}
func (m *QuoteResponse) XXX_Size() int {
	return xxx_messageInfo_QuoteResponse.Size(m)
}
func (m *QuoteResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_QuoteResponse.DiscardUnknown(m)
}

var xxx_messageInfo_QuoteResponse proto.InternalMessageInfo

func (m *QuoteResponse) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *QuoteResponse) GetSymbol() string {
	if m != nil {
		return m.Symbol
	}
	return ""
}

func (m *QuoteResponse) GetLastPrice() float64 {
	if m != nil {
		return m.LastPrice
	}
	return 0
}

func (m *QuoteResponse) GetChange() float64 {
	if m != nil {
		return m.Change
	}
	return 0
}

func (m *QuoteResponse) GetChangePercentage() float64 {
	if m != nil {
		return m.ChangePercentage
	}
	return 0
}

func (m *QuoteResponse) GetMarketCap() int64 {
	if m != nil {
		return m.MarketCap
	}
	return 0
}

func (m *QuoteResponse) GetVolume() int64 {
	if m != nil {
		return m.Volume
	}
	return 0
}

func (m *QuoteResponse) GetChangeYTD() float64 {
	if m != nil {
		return m.ChangeYTD
	}
	return 0
}

func (m *QuoteResponse) GetChangePercentageYTD() float64 {
	if m != nil {
		return m.ChangePercentageYTD
	}
	return 0
}

func (m *QuoteResponse) GetLow() float64 {
	if m != nil {
		return m.Low
	}
	return 0
}

func (m *QuoteResponse) GetHigh() float64 {
	if m != nil {
		return m.High
	}
	return 0
}

func (m *QuoteResponse) GetOpen() float64 {
	if m != nil {
		return m.Open
	}
	return 0
}

func init() {
	proto.RegisterType((*QuoteRequest)(nil), "QuoteRequest")
	proto.RegisterType((*QuotesRequest)(nil), "QuotesRequest")
	proto.RegisterType((*QoutesResponse)(nil), "QoutesResponse")
	proto.RegisterType((*QuoteResponse)(nil), "QuoteResponse")
}

func init() { proto.RegisterFile("quote.proto", fileDescriptor_12e4b46109c2c385) }

var fileDescriptor_12e4b46109c2c385 = []byte{
	// 331 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x92, 0xcf, 0x4e, 0xc2, 0x40,
	0x10, 0xc6, 0x53, 0x8a, 0x48, 0x87, 0xbf, 0x59, 0x13, 0xb3, 0x21, 0x1e, 0x08, 0x07, 0x45, 0x63,
	0x1a, 0x83, 0x17, 0xef, 0x7a, 0xf2, 0x04, 0xd5, 0x8b, 0xc7, 0xd2, 0x4c, 0x0a, 0xda, 0x76, 0x4b,
	0x77, 0x8b, 0xf1, 0x61, 0x7d, 0x17, 0xb3, 0xb3, 0x0b, 0x94, 0xca, 0x6d, 0xe6, 0x9b, 0xdf, 0xec,
	0x37, 0x99, 0x1d, 0xe8, 0x6c, 0x4a, 0xa1, 0xd0, 0xcf, 0x0b, 0xa1, 0xc4, 0xe4, 0x1a, 0xba, 0x0b,
	0x9d, 0x06, 0xb8, 0x29, 0x51, 0x2a, 0x76, 0x09, 0x2d, 0xf9, 0x93, 0x2e, 0x45, 0xc2, 0x9d, 0xb1,
	0x33, 0xf5, 0x02, 0x9b, 0x4d, 0x6e, 0xa0, 0x47, 0x9c, 0x3c, 0x05, 0xba, 0x15, 0xf0, 0x15, 0xfa,
	0x0b, 0x51, 0x12, 0x28, 0x73, 0x91, 0x49, 0x64, 0x4f, 0x30, 0xd8, 0x94, 0x47, 0x12, 0xb5, 0x74,
	0x66, 0x7d, 0xdf, 0x5a, 0x1b, 0x35, 0xa8, 0x63, 0x93, 0xdf, 0x86, 0x75, 0xdd, 0xbf, 0xc5, 0xa0,
	0x99, 0x85, 0x29, 0xda, 0xe1, 0x28, 0xae, 0x4c, 0xd2, 0xa8, 0x8e, 0xcc, 0xae, 0xc0, 0x4b, 0x42,
	0xa9, 0xe6, 0xc5, 0x3a, 0x42, 0xee, 0x8e, 0x9d, 0xa9, 0x13, 0x1c, 0x04, 0xdd, 0x15, 0xad, 0xc2,
	0x2c, 0x46, 0xde, 0xa4, 0x92, 0xcd, 0xd8, 0x1d, 0x0c, 0x4d, 0x34, 0xc7, 0x22, 0xc2, 0x4c, 0x85,
	0x31, 0xf2, 0x33, 0x22, 0xfe, 0xe9, 0xda, 0x21, 0x0d, 0x8b, 0x2f, 0x54, 0xcf, 0x61, 0xce, 0x5b,
	0x63, 0x67, 0xea, 0x06, 0x07, 0x41, 0x3b, 0x6c, 0x45, 0x52, 0xa6, 0xc8, 0xcf, 0xa9, 0x64, 0x33,
	0xdd, 0x65, 0x5e, 0xfa, 0x78, 0x7f, 0xe1, 0x6d, 0x33, 0xd7, 0x5e, 0x60, 0x0f, 0x70, 0x51, 0xf7,
	0xd1, 0x9c, 0x47, 0xdc, 0xa9, 0x12, 0x1b, 0x82, 0x9b, 0x88, 0x6f, 0x0e, 0x44, 0xe8, 0x50, 0x6f,
	0x69, 0xb5, 0x8e, 0x57, 0xbc, 0x43, 0x12, 0xc5, 0x5a, 0x13, 0x39, 0x66, 0xbc, 0x6b, 0x34, 0x1d,
	0xcf, 0x3e, 0x61, 0x60, 0xd6, 0x9b, 0x47, 0x6f, 0x58, 0x6c, 0xf5, 0x5a, 0x6e, 0xa1, 0x1d, 0xa3,
	0x22, 0x95, 0xf5, 0xfc, 0xea, 0x69, 0x8c, 0x6a, 0xdf, 0xc5, 0xee, 0xc1, 0xdb, 0xa1, 0x92, 0xd9,
	0xe2, 0xee, 0x3c, 0x46, 0x03, 0xff, 0xf8, 0x0a, 0x96, 0x2d, 0xba, 0xb7, 0xc7, 0xbf, 0x00, 0x00,
	0x00, 0xff, 0xff, 0x2c, 0x16, 0x4d, 0x03, 0x7e, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// QuoteRpcServiceClient is the client API for QuoteRpcService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type QuoteRpcServiceClient interface {
	GetQuote(ctx context.Context, in *QuoteRequest, opts ...grpc.CallOption) (*QuoteResponse, error)
	GetQuotes(ctx context.Context, in *QuotesRequest, opts ...grpc.CallOption) (*QoutesResponse, error)
}

type quoteRpcServiceClient struct {
	cc *grpc.ClientConn
}

func NewQuoteRpcServiceClient(cc *grpc.ClientConn) QuoteRpcServiceClient {
	return &quoteRpcServiceClient{cc}
}

func (c *quoteRpcServiceClient) GetQuote(ctx context.Context, in *QuoteRequest, opts ...grpc.CallOption) (*QuoteResponse, error) {
	out := new(QuoteResponse)
	err := c.cc.Invoke(ctx, "/QuoteRpcService/getQuote", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *quoteRpcServiceClient) GetQuotes(ctx context.Context, in *QuotesRequest, opts ...grpc.CallOption) (*QoutesResponse, error) {
	out := new(QoutesResponse)
	err := c.cc.Invoke(ctx, "/QuoteRpcService/getQuotes", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// QuoteRpcServiceServer is the server API for QuoteRpcService service.
type QuoteRpcServiceServer interface {
	GetQuote(context.Context, *QuoteRequest) (*QuoteResponse, error)
	GetQuotes(context.Context, *QuotesRequest) (*QoutesResponse, error)
}

// UnimplementedQuoteRpcServiceServer can be embedded to have forward compatible implementations.
type UnimplementedQuoteRpcServiceServer struct {
}

func (*UnimplementedQuoteRpcServiceServer) GetQuote(ctx context.Context, req *QuoteRequest) (*QuoteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetQuote not implemented")
}
func (*UnimplementedQuoteRpcServiceServer) GetQuotes(ctx context.Context, req *QuotesRequest) (*QoutesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetQuotes not implemented")
}

func RegisterQuoteRpcServiceServer(s *grpc.Server, srv QuoteRpcServiceServer) {
	s.RegisterService(&_QuoteRpcService_serviceDesc, srv)
}

func _QuoteRpcService_GetQuote_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QuoteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QuoteRpcServiceServer).GetQuote(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/QuoteRpcService/GetQuote",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QuoteRpcServiceServer).GetQuote(ctx, req.(*QuoteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _QuoteRpcService_GetQuotes_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QuotesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QuoteRpcServiceServer).GetQuotes(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/QuoteRpcService/GetQuotes",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QuoteRpcServiceServer).GetQuotes(ctx, req.(*QuotesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _QuoteRpcService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "QuoteRpcService",
	HandlerType: (*QuoteRpcServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "getQuote",
			Handler:    _QuoteRpcService_GetQuote_Handler,
		},
		{
			MethodName: "getQuotes",
			Handler:    _QuoteRpcService_GetQuotes_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "quote.proto",
}
