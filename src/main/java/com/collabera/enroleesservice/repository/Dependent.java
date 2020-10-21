package com.collabera.enroleesservice.repository;

import com.collabera.enroleesservice.model.Enrollee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dependent extends MongoRepository<Enrollee, Integer> {
}
