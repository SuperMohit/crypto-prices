package com.crypto.document;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RealTimeCryptData {
	
	@JsonProperty("Time Series (Digital Currency Intraday)")
	public Map<String, Object> payload;
	
	 public Map<String, Object> getPayload() {
		return payload;
	}

	public void setPayload(Map<String, Object> payload) {
		this.payload = payload;
	}

}
