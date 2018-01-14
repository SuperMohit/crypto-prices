package com.crypto.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.crypto.document.ETH;

@Repository
public interface ETHRepository
		extends ElasticsearchRepository<ETH, String> {

}
