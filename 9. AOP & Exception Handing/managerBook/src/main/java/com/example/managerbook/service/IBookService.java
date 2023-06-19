package com.example.managerbook.service;

import com.example.managerbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookService {
    public List<Book> getAll();
    Book findById(int id);
    Integer stockQuantity(int id);
    void save(Book book);
}
