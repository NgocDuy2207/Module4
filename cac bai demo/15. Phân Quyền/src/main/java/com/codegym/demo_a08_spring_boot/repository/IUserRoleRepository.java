package com.codegym.demo_a08_spring_boot.repository;

import com.codegym.demo_a08_spring_boot.model.AppUser;
import com.codegym.demo_a08_spring_boot.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByAppUser(AppUser appUser);

}
