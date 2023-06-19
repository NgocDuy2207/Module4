package com.example.ung_dung_blog.repository;

import com.example.ung_dung_blog.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryAppUser extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String username);
}
