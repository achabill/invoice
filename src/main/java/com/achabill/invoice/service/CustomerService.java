package com.achabill.invoice.service;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    Customer findById(Long id);
    Customer save(Customer customer);
    Customer update(Long id, Customer customer) throws Exception;
    List<Customer> findByUser(User user);
}
