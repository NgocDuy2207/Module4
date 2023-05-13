package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<User, Integer> {
}
