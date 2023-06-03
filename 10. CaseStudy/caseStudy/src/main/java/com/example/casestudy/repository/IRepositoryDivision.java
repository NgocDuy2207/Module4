package com.example.casestudy.repository;

import com.example.casestudy.model.employeeModel.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryDivision extends JpaRepository<Division,Integer> {
}
