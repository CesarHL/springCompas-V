package com.ipn.escom.spring.repository;

import com.ipn.escom.spring.model.Customer;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoApplicationRepository extends MongoRepository<Customer, String> {

    Optional<Customer> findById(String entryId);
}
