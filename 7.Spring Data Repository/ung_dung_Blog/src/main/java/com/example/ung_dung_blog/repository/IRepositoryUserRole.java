package com.example.ung_dung_blog.repository;

import com.example.ung_dung_blog.model.AppUser;
import com.example.ung_dung_blog.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepositoryUserRole extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
