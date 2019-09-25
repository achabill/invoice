package com.achabill.invoice.service.impl;

import com.achabill.invoice.model.User;
import com.achabill.invoice.repository.UserRepository;
import com.achabill.invoice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User update(String id, User user) throws NotImplementedException {
        throw new NotImplementedException();
    }
}
