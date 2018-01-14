package com.crypto.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.document.BTC;
import com.crypto.document.DOGE;
import com.crypto.document.ETH;
import com.crypto.document.LTC;
import com.crypto.service.CryptoService;

@RestController
public class CryptoController {
	@Autowired
	CryptoService cryptoService;
	
	@GetMapping("/btc")
	public List<BTC> getAllBTC(@PathParam(value="crypt") String crypt) {
		Iterable<BTC> btc = cryptoService.getAllBTC();
		List<BTC> coins = new ArrayList<>();
        btc.forEach(coins::add);		
        
        return coins;
	}
	
	@GetMapping("/eth")
	public List<ETH> getAllETH() {
		Iterable<ETH> btc = cryptoService.getAllETH();
		List<ETH> coins = new ArrayList<>();
        btc.forEach(coins::add);		
        
        return coins;
	}
	
	@GetMapping("/ltc")
	public List<LTC> getAllLTC() {
		Iterable<LTC> btc = cryptoService.getAllLTC();
		List<LTC> coins = new ArrayList<>();
        btc.forEach(coins::add);		
        
        return coins;
	}
	
	
	@GetMapping("/doge")
	public List<DOGE> getAllDOGE() {
		Iterable<DOGE> btc = cryptoService.getAllDOGE();
		List<DOGE> coins = new ArrayList<>();
        btc.forEach(coins::add);		
        
        return coins;
	}
	
}
