package com.ipn.escom.spring.model;

import java.io.Serializable;
//import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

//@Document
public class Customer implements Serializable {

    private Long id;
    private String firstName;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String email, String mobile, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName + '}';
    }

}
