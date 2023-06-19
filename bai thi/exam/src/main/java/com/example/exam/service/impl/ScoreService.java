package com.example.exam.service.impl;

import com.example.exam.model.Score;
import com.example.exam.repository.ScoreRepository;
import com.example.exam.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ScoreService implements IScoreService {
    @Autowired
    private ScoreRepository repository;
    @Override
    public Page<Score> listAll(int page) {
        return repository.findAll(Pageable.ofSize(3).withPage(page));
    }

    @Override
    public void save(Score score) {
        repository.save(score);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Score finById(int id) {
       return repository.findById(id).orElse(null);
    }

    @Override
    public Page<Score> findByNameStudent(int page, String name) {
        return repository.findAllByStudent_NameLike(Pageable.ofSize(3).withPage(page), name);
    }
}
