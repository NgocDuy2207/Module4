package com.example.casestudy.repository;

import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryRentType extends JpaRepository<RentType, Integer> {
}
