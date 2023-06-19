package com.example.exam.service;

import com.example.exam.model.Score;
import com.example.exam.model.Student;
import com.example.exam.model.Subject;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ISubjectService {
    Page<Subject> listAll(int page);
    void save(Subject subject);
    void delete(int id);
    Subject finById(int id);
    List<Subject> getAll();
}
