package com.achabill.invoice.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Invoice extends AbstractDocument {
    @DBRef
    private Customer customer;
    @DBRef
    private User user;
    @NotNull
    private Date date;
    private Date due;
    @NotNull
    private double total;
    private Tax tax;
    private Discount discount;
    private String currency;
    private boolean isPaid;
    private Set<LineItem> lineItems = new HashSet<>();

    public Invoice() {
    }

    public Invoice(Customer customer, User user, Date date, Date due, double total, Tax tax, Discount discount, String currency, boolean isPaid, Set<LineItem> lineItems) {
        this.customer = customer;
        this.user = user;
        this.date = date;
        this.due = due;
        this.total = total;
        this.tax = tax;
        this.discount = discount;
        this.currency = currency;
        this.isPaid = isPaid;
        this.lineItems = lineItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Set<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Set<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}
