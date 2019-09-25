package com.achabill.invoice.service;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.User;

import java.util.List;

public interface CustomerService {
    Customer findById(String id);

    Customer save(Customer customer);

    Customer update(String id, Customer customer) throws Exception;

    List<Customer> findByUser(User user);
}
