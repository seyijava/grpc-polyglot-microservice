// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.bigdataconcept.microservice.grpc.trader.quote.stub

object StubProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteRequest,
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest,
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse,
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CgpzdHViLnByb3RvEjFjb20uYmlnZGF0YWNvbmNlcHQubWljcm9zZXJ2aWNlLmdycGMudHJhZGVyLnF1b3RlIiYKDFF1b3RlU
  mVxdWVzdBIWCgZzeW1ib2wYASABKAlSBnN5bWJvbCInCg1RdW90ZXNSZXF1ZXN0EhYKBnN5bWJvbBgBIAMoCVIGc3ltYm9sInwKD
  lFvdXRlc1Jlc3BvbnNlEmoKD3F1b3V0ZXNSZXNwb25zZRgBIAMoCzJALmNvbS5iaWdkYXRhY29uY2VwdC5taWNyb3NlcnZpY2UuZ
  3JwYy50cmFkZXIucXVvdGUuUXVvdGVSZXNwb25zZVIPcXVvdXRlc1Jlc3BvbnNlIt0CCg1RdW90ZVJlc3BvbnNlEhIKBG5hbWUYA
  SABKAlSBG5hbWUSFgoGc3ltYm9sGAIgASgJUgZzeW1ib2wSHAoJbGFzdFByaWNlGAMgASgBUglsYXN0UHJpY2USFgoGY2hhbmdlG
  AQgASgBUgZjaGFuZ2USKgoQY2hhbmdlUGVyY2VudGFnZRgFIAEoAVIQY2hhbmdlUGVyY2VudGFnZRIcCgltYXJrZXRDYXAYBiABK
  ANSCW1hcmtldENhcBIWCgZ2b2x1bWUYByABKANSBnZvbHVtZRIcCgljaGFuZ2VZVEQYCCABKAFSCWNoYW5nZVlURBIwChNjaGFuZ
  2VQZXJjZW50YWdlWVREGAkgASgBUhNjaGFuZ2VQZXJjZW50YWdlWVREEhAKA2xvdxgKIAEoAVIDbG93EhIKBGhpZ2gYCyABKAFSB
  GhpZ2gSEgoEb3BlbhgMIAEoAVIEb3BlbjK0AgoPUXVvdGVScGNTZXJ2aWNlEo0BCghnZXRRdW90ZRI/LmNvbS5iaWdkYXRhY29uY
  2VwdC5taWNyb3NlcnZpY2UuZ3JwYy50cmFkZXIucXVvdGUuUXVvdGVSZXF1ZXN0GkAuY29tLmJpZ2RhdGFjb25jZXB0Lm1pY3Jvc
  2VydmljZS5ncnBjLnRyYWRlci5xdW90ZS5RdW90ZVJlc3BvbnNlEpABCglnZXRRdW90ZXMSQC5jb20uYmlnZGF0YWNvbmNlcHQub
  Wljcm9zZXJ2aWNlLmdycGMudHJhZGVyLnF1b3RlLlF1b3Rlc1JlcXVlc3QaQS5jb20uYmlnZGF0YWNvbmNlcHQubWljcm9zZXJ2a
  WNlLmdycGMudHJhZGVyLnF1b3RlLlFvdXRlc1Jlc3BvbnNlYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}