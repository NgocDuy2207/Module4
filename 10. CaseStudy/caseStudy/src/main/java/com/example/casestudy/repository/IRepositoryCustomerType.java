package com.example.casestudy.repository;

import com.example.casestudy.model.customerModel.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCustomerType extends JpaRepository<CustomerType, Integer> {
}
