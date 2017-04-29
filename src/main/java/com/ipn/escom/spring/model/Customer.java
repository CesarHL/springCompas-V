package com.ipn.escom.spring.model;

import java.io.Serializable;


public class Customer implements Serializable {

    private Long id;
    private String firstName;

    public Customer() {
    }

    public Customer(Long id, String firstName) {
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
