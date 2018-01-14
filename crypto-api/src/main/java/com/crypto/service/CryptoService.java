package com.crypto.service;

import org.springframework.transaction.annotation.Transactional;

import com.crypto.document.BTC;
import com.crypto.document.DOGE;
import com.crypto.document.ETH;
import com.crypto.document.LTC;


public interface CryptoService {
	@Transactional
	Iterable<BTC> getAllBTC();
	
	@Transactional
	Iterable<ETH> getAllETH();
	
	@Transactional
	Iterable<LTC> getAllLTC();
	
	@Transactional
	Iterable<DOGE> getAllDOGE();
	
}
