package com.achabill.invoice.repository;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByUser(User user);
}
