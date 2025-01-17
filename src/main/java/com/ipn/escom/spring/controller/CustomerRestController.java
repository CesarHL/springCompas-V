package com.ipn.escom.spring.controller;

import com.ion.escom.spring.logicLayer.ApplicationLayer;
import com.ipn.escom.spring.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRestController.class);

    @Autowired
    private ApplicationLayer applicationLayer;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomers(@PathVariable("id") String entryId) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/r", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Customer c, UriComponentsBuilder uriBuilder) {

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
