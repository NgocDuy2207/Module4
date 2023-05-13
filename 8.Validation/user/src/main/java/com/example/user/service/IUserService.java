package com.example.user.service;

import com.example.user.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    void save(User user);


}
