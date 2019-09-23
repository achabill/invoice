package com.achabill.invoice.model;

import java.io.Serializable;

public class CreateUserResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;

    private User user;
    private JwtResponse jwtResponse;

    public CreateUserResponse(User user, JwtResponse jwtResponse) {
        this.user = user;
        this.jwtResponse = jwtResponse;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JwtResponse getJwtResponse() {
        return jwtResponse;
    }

    public void setJwtResponse(JwtResponse jwtResponse) {
        this.jwtResponse = jwtResponse;
    }
}
