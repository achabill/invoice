package com.achabill.invoice.service;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.Invoice;
import com.achabill.invoice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InvoiceService {
    Invoice findById(String id);
    Invoice save(Invoice invoice);
    List<Invoice> findByUser(User user);
    List<Invoice> findByCustomer(Customer customer);
    void updateIsPaid(String id, boolean isPaid) throws Exception;
}
