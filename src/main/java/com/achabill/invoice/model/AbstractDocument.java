package com.achabill.invoice.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class AbstractDocument {
    @Id
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
