package com.example.managerbook.service;

import com.example.managerbook.model.Book;
import com.example.managerbook.model.Student;

import java.util.List;

public interface IStudentService {
public List<Student> getAll();
    Student findById(int id);

}
