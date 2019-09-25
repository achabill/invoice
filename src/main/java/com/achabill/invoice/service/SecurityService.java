package com.achabill.invoice.service;

public interface SecurityService {
    String findLoggedInUser();

    String authenticate(String email, String password) throws Exception;
}
