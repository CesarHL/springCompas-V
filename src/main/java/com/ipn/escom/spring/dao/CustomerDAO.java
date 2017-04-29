package com.ipn.escom.spring.dao;

import org.springframework.stereotype.Component;
import com.ipn.escom.spring.model.Customer;

@Component
public class CustomerDAO {

    public Customer create(Customer customer) {
        customer.setId(System.currentTimeMillis());
        return customer;
    }

}
