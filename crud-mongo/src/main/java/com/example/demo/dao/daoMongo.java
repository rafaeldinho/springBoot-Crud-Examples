package com.example.demo.dao;

import com.example.demo.model.demoMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface daoMongo extends MongoRepository<demoMongo, String>{
}
