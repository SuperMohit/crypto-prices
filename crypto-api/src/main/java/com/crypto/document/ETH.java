package com.crypto.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "eth", type = "crypto")
public class ETH extends Crypto{
	@Id
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
