package com.example.casestudy.repository;

import com.example.casestudy.model.employeeModel.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryDivision extends JpaRepository<Division,Integer> {
}
