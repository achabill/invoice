package com.achabill.invoice.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class AbstractDocument {
    @Id
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractDocument)) return false;
        AbstractDocument that = (AbstractDocument) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
