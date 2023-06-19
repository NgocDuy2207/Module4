package com.example.exam.service;

import com.example.exam.model.Score;
import com.example.exam.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IStudentService {
    Page<Student> listAll(int page);
    void save(Student student);
    void delete(int id);
    Student finById(int id);
    List<Student> getAll();
    List<Student> findByIdStudent(String name);
}
