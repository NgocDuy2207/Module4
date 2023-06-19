package com.codegym.demo_a08_spring_boot.repository;


import com.codegym.demo_a08_spring_boot.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
