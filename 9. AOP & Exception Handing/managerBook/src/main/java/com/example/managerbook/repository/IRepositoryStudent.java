package com.example.managerbook.repository;

import com.example.managerbook.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryStudent extends JpaRepository<Student, Integer> {
}
