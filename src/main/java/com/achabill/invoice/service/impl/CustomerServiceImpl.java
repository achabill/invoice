package com.achabill.invoice.service.impl;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.User;
import com.achabill.invoice.repository.CustomerRepository;
import com.achabill.invoice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.repository = customerRepository;
    }

    @Override
    public Customer findById(String id) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        return optionalCustomer.isPresent() ? optionalCustomer.get() : null;
    }

    @Override
    public Customer save(Customer customer) {
        return this.repository.save(customer);
    }

    @Override
    public Customer update(String id, Customer customer) throws Exception {
        Optional<Customer> optionalCustomer = this.repository.findById(id);
        if (!optionalCustomer.isPresent()) {
            throw new Exception("customer not found");
        }
        Customer oldCustomer = optionalCustomer.get();
        oldCustomer.setName(customer.getName());
        oldCustomer.setEmail(customer.getEmail());
        oldCustomer.setAddress(customer.getAddress());
        oldCustomer.setPhone(customer.getPhone());
        return repository.save(oldCustomer);
    }


    @Override
    public List<Customer> findByUser(User user) {
        return repository.findByUser(user);
    }
}
