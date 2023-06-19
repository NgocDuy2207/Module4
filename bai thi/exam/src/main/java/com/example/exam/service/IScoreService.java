package com.example.exam.service;

import com.example.exam.model.Score;
import com.example.exam.model.Subject;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IScoreService {
    Page<Score> listAll(int page);
    void save(Score score);
    void delete(int id);
    Score finById(int id);
    Page<Score> findByNameStudent(int page, String name);

}
