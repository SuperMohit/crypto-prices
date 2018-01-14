package com.crypto.repo;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.crypto.document.BTC;

@Repository
public interface BTCRepository
		extends ElasticsearchRepository<BTC, String> {

	
}
