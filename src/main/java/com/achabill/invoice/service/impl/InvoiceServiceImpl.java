package com.achabill.invoice.service.impl;

import com.achabill.invoice.model.Customer;
import com.achabill.invoice.model.Invoice;
import com.achabill.invoice.model.User;
import com.achabill.invoice.repository.InvoiceRepository;
import com.achabill.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository repository;

    @Autowired
    public InvoiceServiceImpl(InvoiceRepository repository){
        this.repository = repository;
    }

    @Override
    public Invoice findById(String id) {
        Optional<Invoice> optionalInvoice = repository.findById(id);
        return optionalInvoice.isPresent() ? optionalInvoice.get() : null;
    }

    @Override
    public Invoice save(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public List<Invoice> findByUser(User user) {
        return repository.findByUser(user);
    }

    @Override
    public List<Invoice> findByCustomer(Customer customer) {
        return repository.findByCustomer(customer);
    }

    @Override
    public void updateIsPaid(String id, boolean isPaid) throws Exception {
        Optional<Invoice> optionalInvoice = repository.findById(id);
        if(!optionalInvoice.isPresent()){
            throw new Exception("Invoice not found");
        }
    }
}
