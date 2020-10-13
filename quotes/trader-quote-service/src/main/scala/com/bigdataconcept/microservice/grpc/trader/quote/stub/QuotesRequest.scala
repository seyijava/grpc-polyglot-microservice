// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.bigdataconcept.microservice.grpc.trader.quote.stub

@SerialVersionUID(0L)
final case class QuotesRequest(
    symbol: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[QuotesRequest] with scalapb.lenses.Updatable[QuotesRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      symbol.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      symbol.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest = {
      val __symbol = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.symbol)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __symbol += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest(
          symbol = __symbol.result()
      )
    }
    def clearSymbol = copy(symbol = _root_.scala.collection.Seq.empty)
    def addSymbol(__vs: _root_.scala.Predef.String*): QuotesRequest = addAllSymbol(__vs)
    def addAllSymbol(__vs: TraversableOnce[_root_.scala.Predef.String]): QuotesRequest = copy(symbol = symbol ++ __vs)
    def withSymbol(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): QuotesRequest = copy(symbol = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => symbol
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(symbol.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest
}

object QuotesRequest extends scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StubProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StubProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest(
  )
  implicit class QuotesRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuotesRequest](_l) {
    def symbol: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.symbol)((c_, f_) => c_.copy(symbol = f_))
  }
  final val SYMBOL_FIELD_NUMBER = 1
}