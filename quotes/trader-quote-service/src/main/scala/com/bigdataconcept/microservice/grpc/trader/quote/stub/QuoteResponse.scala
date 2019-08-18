// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.bigdataconcept.microservice.grpc.trader.quote.stub

@SerialVersionUID(0L)
final case class QuoteResponse(
    name: _root_.scala.Predef.String = "",
    symbol: _root_.scala.Predef.String = "",
    lastPrice: _root_.scala.Double = 0.0,
    change: _root_.scala.Double = 0.0,
    changePercentage: _root_.scala.Double = 0.0,
    marketCap: _root_.scala.Long = 0L,
    volume: _root_.scala.Long = 0L,
    changeYTD: _root_.scala.Double = 0.0,
    changePercentageYTD: _root_.scala.Double = 0.0,
    low: _root_.scala.Double = 0.0,
    high: _root_.scala.Double = 0.0,
    open: _root_.scala.Double = 0.0
    ) extends scalapb.GeneratedMessage with scalapb.Message[QuoteResponse] with scalapb.lenses.Updatable[QuoteResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = symbol
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = lastPrice
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(3, __value)
        }
      };
      
      {
        val __value = change
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(4, __value)
        }
      };
      
      {
        val __value = changePercentage
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(5, __value)
        }
      };
      
      {
        val __value = marketCap
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(6, __value)
        }
      };
      
      {
        val __value = volume
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(7, __value)
        }
      };
      
      {
        val __value = changeYTD
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(8, __value)
        }
      };
      
      {
        val __value = changePercentageYTD
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(9, __value)
        }
      };
      
      {
        val __value = low
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(10, __value)
        }
      };
      
      {
        val __value = high
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(11, __value)
        }
      };
      
      {
        val __value = open
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(12, __value)
        }
      };
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
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = symbol
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = lastPrice
        if (__v != 0.0) {
          _output__.writeDouble(3, __v)
        }
      };
      {
        val __v = change
        if (__v != 0.0) {
          _output__.writeDouble(4, __v)
        }
      };
      {
        val __v = changePercentage
        if (__v != 0.0) {
          _output__.writeDouble(5, __v)
        }
      };
      {
        val __v = marketCap
        if (__v != 0L) {
          _output__.writeInt64(6, __v)
        }
      };
      {
        val __v = volume
        if (__v != 0L) {
          _output__.writeInt64(7, __v)
        }
      };
      {
        val __v = changeYTD
        if (__v != 0.0) {
          _output__.writeDouble(8, __v)
        }
      };
      {
        val __v = changePercentageYTD
        if (__v != 0.0) {
          _output__.writeDouble(9, __v)
        }
      };
      {
        val __v = low
        if (__v != 0.0) {
          _output__.writeDouble(10, __v)
        }
      };
      {
        val __v = high
        if (__v != 0.0) {
          _output__.writeDouble(11, __v)
        }
      };
      {
        val __v = open
        if (__v != 0.0) {
          _output__.writeDouble(12, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse = {
      var __name = this.name
      var __symbol = this.symbol
      var __lastPrice = this.lastPrice
      var __change = this.change
      var __changePercentage = this.changePercentage
      var __marketCap = this.marketCap
      var __volume = this.volume
      var __changeYTD = this.changeYTD
      var __changePercentageYTD = this.changePercentageYTD
      var __low = this.low
      var __high = this.high
      var __open = this.open
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __symbol = _input__.readString()
          case 25 =>
            __lastPrice = _input__.readDouble()
          case 33 =>
            __change = _input__.readDouble()
          case 41 =>
            __changePercentage = _input__.readDouble()
          case 48 =>
            __marketCap = _input__.readInt64()
          case 56 =>
            __volume = _input__.readInt64()
          case 65 =>
            __changeYTD = _input__.readDouble()
          case 73 =>
            __changePercentageYTD = _input__.readDouble()
          case 81 =>
            __low = _input__.readDouble()
          case 89 =>
            __high = _input__.readDouble()
          case 97 =>
            __open = _input__.readDouble()
          case tag => _input__.skipField(tag)
        }
      }
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse(
          name = __name,
          symbol = __symbol,
          lastPrice = __lastPrice,
          change = __change,
          changePercentage = __changePercentage,
          marketCap = __marketCap,
          volume = __volume,
          changeYTD = __changeYTD,
          changePercentageYTD = __changePercentageYTD,
          low = __low,
          high = __high,
          open = __open
      )
    }
    def withName(__v: _root_.scala.Predef.String): QuoteResponse = copy(name = __v)
    def withSymbol(__v: _root_.scala.Predef.String): QuoteResponse = copy(symbol = __v)
    def withLastPrice(__v: _root_.scala.Double): QuoteResponse = copy(lastPrice = __v)
    def withChange(__v: _root_.scala.Double): QuoteResponse = copy(change = __v)
    def withChangePercentage(__v: _root_.scala.Double): QuoteResponse = copy(changePercentage = __v)
    def withMarketCap(__v: _root_.scala.Long): QuoteResponse = copy(marketCap = __v)
    def withVolume(__v: _root_.scala.Long): QuoteResponse = copy(volume = __v)
    def withChangeYTD(__v: _root_.scala.Double): QuoteResponse = copy(changeYTD = __v)
    def withChangePercentageYTD(__v: _root_.scala.Double): QuoteResponse = copy(changePercentageYTD = __v)
    def withLow(__v: _root_.scala.Double): QuoteResponse = copy(low = __v)
    def withHigh(__v: _root_.scala.Double): QuoteResponse = copy(high = __v)
    def withOpen(__v: _root_.scala.Double): QuoteResponse = copy(open = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = symbol
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = lastPrice
          if (__t != 0.0) __t else null
        }
        case 4 => {
          val __t = change
          if (__t != 0.0) __t else null
        }
        case 5 => {
          val __t = changePercentage
          if (__t != 0.0) __t else null
        }
        case 6 => {
          val __t = marketCap
          if (__t != 0L) __t else null
        }
        case 7 => {
          val __t = volume
          if (__t != 0L) __t else null
        }
        case 8 => {
          val __t = changeYTD
          if (__t != 0.0) __t else null
        }
        case 9 => {
          val __t = changePercentageYTD
          if (__t != 0.0) __t else null
        }
        case 10 => {
          val __t = low
          if (__t != 0.0) __t else null
        }
        case 11 => {
          val __t = high
          if (__t != 0.0) __t else null
        }
        case 12 => {
          val __t = open
          if (__t != 0.0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(symbol)
        case 3 => _root_.scalapb.descriptors.PDouble(lastPrice)
        case 4 => _root_.scalapb.descriptors.PDouble(change)
        case 5 => _root_.scalapb.descriptors.PDouble(changePercentage)
        case 6 => _root_.scalapb.descriptors.PLong(marketCap)
        case 7 => _root_.scalapb.descriptors.PLong(volume)
        case 8 => _root_.scalapb.descriptors.PDouble(changeYTD)
        case 9 => _root_.scalapb.descriptors.PDouble(changePercentageYTD)
        case 10 => _root_.scalapb.descriptors.PDouble(low)
        case 11 => _root_.scalapb.descriptors.PDouble(high)
        case 12 => _root_.scalapb.descriptors.PDouble(open)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse
}

object QuoteResponse extends scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(3), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(4), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(5), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(6), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(7), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(8), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(9), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(10), 0.0).asInstanceOf[_root_.scala.Double],
      __fieldsMap.getOrElse(__fields.get(11), 0.0).asInstanceOf[_root_.scala.Double]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Double]).getOrElse(0.0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StubProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StubProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse(
  )
  implicit class QuoteResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.bigdataconcept.microservice.grpc.trader.quote.stub.QuoteResponse](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def symbol: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.symbol)((c_, f_) => c_.copy(symbol = f_))
    def lastPrice: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.lastPrice)((c_, f_) => c_.copy(lastPrice = f_))
    def change: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.change)((c_, f_) => c_.copy(change = f_))
    def changePercentage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.changePercentage)((c_, f_) => c_.copy(changePercentage = f_))
    def marketCap: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.marketCap)((c_, f_) => c_.copy(marketCap = f_))
    def volume: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.volume)((c_, f_) => c_.copy(volume = f_))
    def changeYTD: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.changeYTD)((c_, f_) => c_.copy(changeYTD = f_))
    def changePercentageYTD: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.changePercentageYTD)((c_, f_) => c_.copy(changePercentageYTD = f_))
    def low: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.low)((c_, f_) => c_.copy(low = f_))
    def high: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.high)((c_, f_) => c_.copy(high = f_))
    def open: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.open)((c_, f_) => c_.copy(open = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val SYMBOL_FIELD_NUMBER = 2
  final val LASTPRICE_FIELD_NUMBER = 3
  final val CHANGE_FIELD_NUMBER = 4
  final val CHANGEPERCENTAGE_FIELD_NUMBER = 5
  final val MARKETCAP_FIELD_NUMBER = 6
  final val VOLUME_FIELD_NUMBER = 7
  final val CHANGEYTD_FIELD_NUMBER = 8
  final val CHANGEPERCENTAGEYTD_FIELD_NUMBER = 9
  final val LOW_FIELD_NUMBER = 10
  final val HIGH_FIELD_NUMBER = 11
  final val OPEN_FIELD_NUMBER = 12
}
