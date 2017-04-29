package com.ipn.escom.spring.controller;

import com.ipn.escom.spring.dao.CustomerDAO;
import com.ipn.escom.spring.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class CustomerRestController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRestController.class);

    @Autowired
    CustomerDAO customerService;

    @GetMapping("/")
    public ResponseEntity getCustomers() {
        Customer c = new Customer();
        customerService.create(c);
        logger.info("Customer: " + c);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/r", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Customer c, UriComponentsBuilder uriBuilder) {

        customerService.create(c);
        logger.info("Customer: " + c);
        System.out.println(c);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
