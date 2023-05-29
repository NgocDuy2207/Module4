package com.example.casestudy.repository;

import com.example.casestudy.model.employeeModel.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryEducationDegree extends JpaRepository<EducationDegree, Integer> {
}
