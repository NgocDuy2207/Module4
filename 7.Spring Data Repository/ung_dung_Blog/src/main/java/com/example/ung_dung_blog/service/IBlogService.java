package com.example.ung_dung_blog.service;

import com.example.ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Page<Blog> findAll(int page);

    void save(Blog blog);

    Blog findById(int id);

    void update(int id, Blog blog);

    void remove(int id);

}
