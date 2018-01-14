package com.crypto.document;

import java.math.BigDecimal;


public class LatestPrice {

	BigDecimal price;
	BigDecimal volume;

	BigDecimal marketCap;
	
	public LatestPrice(BigDecimal price, BigDecimal volume, BigDecimal marketCap) {
		super();
		this.price = price;
		this.volume = volume;
		this.marketCap = marketCap;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public BigDecimal getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(BigDecimal marketCap) {
		this.marketCap = marketCap;
	}


}
