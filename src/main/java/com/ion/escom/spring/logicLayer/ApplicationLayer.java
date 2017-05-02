package com.ion.escom.spring.logicLayer;

import com.ipn.escom.spring.model.Customer;
import com.ipn.escom.spring.repository.MongoApplicationRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ApplicationLayer {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationLayer.class);

    @Autowired
    private MongoApplicationRepository mongoApplicationRepository;

  /*  public Optional<Customer> readOne(String entryId) {

        logger.debug("Searching log " + entryId);

        Optional<Customer> entry = mongoApplicationRepository.findById(entryId);

        if (entry.isPresent()) {
            logger.debug("Searching element " + entry);
            entry = mongoApplicationRepository.findById(entryId);
        } else {
            logger.debug("Not found element by id " + entryId);
        }
        return entry;
    }*/

    public void create(Customer customer) {
        mongoApplicationRepository.insert(customer);
    }

}
