// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.bigdataconcept.microservice.grpc.trader.quote.stub

@SerialVersionUID(0L)
final case class QoutesResponse(
    quoutesResponse: _root_.scala.collection.Seq[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[QoutesResponse] with scalapb.lenses.Updatable[QoutesResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      quoutesResponse.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      quoutesResponse.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse = {
      val __quoutesResponse = (_root_.scala.collection.immutable.Vector.newBuilder[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] ++= this.quoutesResponse)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __quoutesResponse += _root_.scalapb.LiteParser.readMessage(_input__, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse(
          quoutesResponse = __quoutesResponse.result()
      )
    }
    def clearQuoutesResponse = copy(quoutesResponse = _root_.scala.collection.Seq.empty)
    def addQuoutesResponse(__vs: com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse*): QoutesResponse = addAllQuoutesResponse(__vs)
    def addAllQuoutesResponse(__vs: TraversableOnce[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]): QoutesResponse = copy(quoutesResponse = quoutesResponse ++ __vs)
    def withQuoutesResponse(__v: _root_.scala.collection.Seq[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]): QoutesResponse = copy(quoutesResponse = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => quoutesResponse
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(quoutesResponse.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse
}

object QoutesResponse extends scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StubProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StubProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse(
  )
  implicit class QoutesResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QoutesResponse](_l) {
    def quoutesResponse: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]] = field(_.quoutesResponse)((c_, f_) => c_.copy(quoutesResponse = f_))
  }
  final val QUOUTESRESPONSE_FIELD_NUMBER = 1
}
