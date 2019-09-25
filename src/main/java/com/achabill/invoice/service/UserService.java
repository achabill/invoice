package com.achabill.invoice.service;

import com.achabill.invoice.model.User;

public interface UserService {
    User findByUsername(String username);

    User save(User user);

    User update(String id, User user) throws Exception;
}
