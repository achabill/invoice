package com.achabill.invoice.repository;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.Invoice;
import com.achabill.invoice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends MongoRepository<Invoice, String> {
    List<Invoice> findByCustomer(Customer customer);

    List<Invoice> findByUser(User user);
}
