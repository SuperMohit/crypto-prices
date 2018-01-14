package com.crypto.controller;

import java.math.BigDecimal;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.crypto.document.LatestPrice;
import com.crypto.document.RealTimeCryptData;

@RestController
public class ThirdPartyAPI {

	@Value("${crypt.url}")
	String url;
	@Value("${crypt.function}")
	String function;
	@Value("${crypt.market}")
	String market;
	@Value("${crypt.apikey}")
	String apikey;

	@GetMapping("/realtime/{crypt}")
	public LatestPrice getCryptoData(@PathVariable(value = "crypt") String crypt) {

		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = buildURI(crypt);

		URI uri = builder.buildAndExpand().toUri();

		ResponseEntity<RealTimeCryptData> response = restTemplate.getForEntity(uri, RealTimeCryptData.class);

		RealTimeCryptData data = response.getBody();

		LatestPrice price = extractLatestData(data);
		
		return price;

	}

	@SuppressWarnings("unchecked")
	private LatestPrice extractLatestData(RealTimeCryptData data) {
		Entry<String, Object> entry = data.getPayload().entrySet().iterator().next();
		Map<String, Object> value = (Map<String, Object>) entry.getValue();
		Iterator<Entry<String, Object>> itr = value.entrySet().iterator();
		String l1 =  (String) itr.next().getValue();
		String l2 =  (String) itr.next().getValue();
		String l3 =  (String) itr.next().getValue();
		LatestPrice price = new LatestPrice(new BigDecimal(l1), new BigDecimal(l2), new BigDecimal(l3));
		return price;
	}

	private UriComponentsBuilder buildURI(String crypt) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).queryParam("function", function)
				.queryParam("symbol", crypt).queryParam("market", market).queryParam("apikey", apikey);
		return builder;
	}

}
