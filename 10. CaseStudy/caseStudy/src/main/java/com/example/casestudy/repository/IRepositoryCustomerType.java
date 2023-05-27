package com.example.casestudy.repository;

import com.example.casestudy.model.customerModel.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryCustomerType extends JpaRepository<CustomerType, Integer> {
}
