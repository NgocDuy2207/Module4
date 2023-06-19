package com.example.exam.service.impl;
import com.example.exam.model.Subject;
import com.example.exam.repository.SubjectRepository;
import com.example.exam.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private SubjectRepository repository;

    @Override
    public Page<Subject> listAll(int page) {
        return repository.findAll(Pageable.ofSize(3).withPage(page));
    }

    @Override
    public void save(Subject subject) {
        repository.save(subject);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Subject finById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Subject> getAll() {
        return repository.findAll();
    }
}
