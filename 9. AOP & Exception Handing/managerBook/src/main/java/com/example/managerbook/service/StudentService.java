package com.example.managerbook.service;

import com.example.managerbook.model.Student;
import com.example.managerbook.repository.IRepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    @Autowired
    private IRepositoryStudent repository;
    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }
}
