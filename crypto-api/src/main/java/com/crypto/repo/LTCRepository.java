package com.crypto.repo;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.crypto.document.LTC;

@Repository
public interface LTCRepository
		extends ElasticsearchRepository<LTC, String> {

	
}
