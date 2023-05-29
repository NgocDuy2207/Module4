package com.example.casestudy.repository;

import com.example.casestudy.model.employeeModel.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryPosition extends JpaRepository<Position, Integer> {
}
