package com.example.ung_dung_blog.service;
import com.example.ung_dung_blog.model.Blog;
import com.example.ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository repository;
    @Override
    public List<Blog> getAll() {
       return null;
    }

    @Override
    public Page<Blog> findAll(int page) {
        return repository.findAllSortDay(PageRequest.of(page, 3));
    }

    @Override
    public void save(Blog blog) {
        this.repository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void update(int id, Blog blog) {
        this.repository.save(blog);
    }

    @Override
    public void remove(int id) {
        Blog blog = findById(id);
        this.repository.delete(blog);
    }
}
