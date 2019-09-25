package com.achabill.invoice.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;

public class Customer extends AbstractDocument {
    @NotNull
    private String name;
    @NotNull
    private String email;
    private Address address;
    private String phone;
    @DBRef
    private
    User user;


    public Customer(String name, String email, Address address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
