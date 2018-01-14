package com.crypto.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crypto.document.BTC;
import com.crypto.document.DOGE;
import com.crypto.document.ETH;
import com.crypto.document.LTC;
import com.crypto.repo.BTCRepository;
import com.crypto.repo.DOGERepository;
import com.crypto.repo.ETHRepository;
import com.crypto.repo.LTCRepository;

@Service
public class CryptoServiceImpl implements CryptoService {
	@Autowired
	BTCRepository btcRepository;
	@Autowired
    ETHRepository ethRepository;
	@Autowired
    LTCRepository ltcRepository;
	@Autowired
    DOGERepository dogeRepository;
	
	
    @Override
	public Iterable<BTC> getAllBTC() {
      	return btcRepository.findAll();
	}

	@Override
	public Iterable<ETH> getAllETH() {
		return ethRepository.findAll();
	}

	@Override
	public Iterable<LTC> getAllLTC() {		
		return ltcRepository.findAll();
	}

	@Override
	public Iterable<DOGE> getAllDOGE() {
		// TODO Auto-generated method stub
		return dogeRepository.findAll();
	}
}
