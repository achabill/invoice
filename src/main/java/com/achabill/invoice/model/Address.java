package com.achabill.invoice.model;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Address {
    @NotNull
    String country;
    String state;
    String city;

    public Address(String country, String state, String city) {
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getCountry(), address.getCountry()) &&
                Objects.equals(getState(), address.getState()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getState(), getCity());
    }
}
