package com.arabbank.arabina.adapter.repo;

import com.arabbank.arabina.model.Simple;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArabinaRepository extends MongoRepository<Simple, String> {
}
