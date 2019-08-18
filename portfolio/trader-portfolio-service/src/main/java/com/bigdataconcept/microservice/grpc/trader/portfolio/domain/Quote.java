package com.bigdataconcept.microservice.grpc.trader.portfolio.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Quote {

	
	
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Symbol")
	private String symbol;
	@JsonProperty("LastPrice")
	private BigDecimal lastPrice;
	@JsonProperty("Change")
	private BigDecimal change;
	@JsonProperty("ChangePercent")
	private Float changePercent;
	@JsonProperty("Timestamp")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="EEE MMM dd HH:mm:ss zzzXXX yyyy", locale="ENGLISH")
	private Date timestamp;
	@JsonProperty("MSDate")
	private Float mSDate;
	@JsonProperty("MarketCap")
	private Float marketCap;
	@JsonProperty("Volume")
	private Integer volume;
	@JsonProperty("ChangeYTD")
	private Float changeYTD;
	@JsonProperty("ChangePercentYTD")
	private Float changePercentYTD;
	@JsonProperty("High")
	private BigDecimal high;
	@JsonProperty("Low")
	private BigDecimal low;
	@JsonProperty("Open")
	private BigDecimal open;
}
