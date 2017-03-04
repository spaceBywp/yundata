package com.yundata.mongo;

import com.yundata.demo.DemoCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoCollectionRepository extends MongoRepository<DemoCollection, Long> {
    DemoCollection findById(String Id);
}