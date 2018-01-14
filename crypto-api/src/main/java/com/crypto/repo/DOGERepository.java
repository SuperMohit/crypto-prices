package com.crypto.repo;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.crypto.document.DOGE;

@Repository
public interface DOGERepository
		extends ElasticsearchRepository<DOGE, String> {

	
}
