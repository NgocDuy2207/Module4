package com.example.exam.repository;

import com.example.exam.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    ArrayList<Student> findAllByIdStudent(String IdStudent);

}
