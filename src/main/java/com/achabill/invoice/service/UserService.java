package com.achabill.invoice.service;

import com.achabill.invoice.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User findByUsername(String username);
    User save(User user);
    User update(Long id, User user) throws Exception;
}
