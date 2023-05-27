package com.example.casestudy.repository;

import com.example.casestudy.model.customerModel.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryCustomer extends JpaRepository<Customer, Integer> {
}
