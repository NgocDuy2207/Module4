package com.example.casestudy.repository;

import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryRentType extends JpaRepository<RentType, Integer> {
}
