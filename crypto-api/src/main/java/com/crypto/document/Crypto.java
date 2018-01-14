package com.crypto.document;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Crypto {

	 Date date; 
	 @JsonProperty("txVolume(USD)")
     String txVolume;
     BigDecimal txCount;
     @JsonProperty("marketcap(USD)")
     BigDecimal marketcap;
     @JsonProperty("price(USD)")
     BigDecimal price;
     @JsonProperty("exchangeVolume(USD)")
     BigDecimal exchangeVolume;
     BigDecimal generatedCoins;
     BigDecimal fees;
     
     
 	
    public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTxVolume() {
		return txVolume;
	}
	public void setTxVolume(String txVolume) {
		this.txVolume = txVolume;
	}
	public BigDecimal getTxCount() {
		return txCount;
	}
	public void setTxCount(BigDecimal txCount) {
		this.txCount = txCount;
	}
	public BigDecimal getMarketcap() {
		return marketcap;
	}
	public void setMarketcap(BigDecimal marketcap) {
		this.marketcap = marketcap;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getExchangeVolume() {
		return exchangeVolume;
	}
	public void setExchangeVolume(BigDecimal exchangeVolume) {
		this.exchangeVolume = exchangeVolume;
	}
	public BigDecimal getGeneratedCoins() {
		return generatedCoins;
	}
	public void setGeneratedCoins(BigDecimal generatedCoins) {
		this.generatedCoins = generatedCoins;
	}
	public BigDecimal getFees() {
		return fees;
	}
	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

}


