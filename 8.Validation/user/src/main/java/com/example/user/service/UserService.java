package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    private IRepository repository;
    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }
}
