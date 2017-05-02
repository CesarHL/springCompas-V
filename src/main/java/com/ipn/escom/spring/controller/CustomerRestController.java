package com.ipn.escom.spring.controller;

import com.ipn.escom.spring.dao.CustomerDAO;
import com.ipn.escom.spring.model.Customer;
import com.ipn.escom.spring.repository.MongoApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRestController.class);

    @Autowired
    private MongoApplicationRepository mongoApplicationRepository;

    @Autowired
    CustomerDAO customerService;

    @GetMapping("/")
    public Optional<Customer> getCustomers(String entryId) {

        Optional<Customer> entry = mongoApplicationRepository.findById(entryId);

        if (entry.isPresent()) {
            logger.debug("Searching element " + entry);
            entry = mongoApplicationRepository.findById(entryId);
        } else {
            logger.debug("Not found element by id " + entryId);
        }
        return entry;
    }

    @RequestMapping(value = "/r", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Customer c, UriComponentsBuilder uriBuilder) {

        customerService.create(c);
        logger.info("Customer: " + c);
        System.out.println(c);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
