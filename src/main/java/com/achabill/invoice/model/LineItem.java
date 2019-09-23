package com.achabill.invoice.model;

public class LineItem {
    private double amount;
    private String description;
    private int quantity;

    public LineItem(double amount, String description, int quantity) {
        this.amount = amount;
        this.description = description;
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
