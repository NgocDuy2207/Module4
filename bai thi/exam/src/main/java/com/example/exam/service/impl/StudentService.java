package com.example.exam.service.impl;

import com.example.exam.model.Score;
import com.example.exam.model.Student;
import com.example.exam.repository.StudentRepository;
import com.example.exam.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public Page<Student> listAll(int page) {
        return repository.findAll(Pageable.ofSize(3).withPage(page));
    }

    @Override
    public void save(Student student) {

            repository.save(student);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student finById(int id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }
    @Override
    public List<Student> findByIdStudent(String name){
       return repository.findAllByIdStudent(name);
    }

}
