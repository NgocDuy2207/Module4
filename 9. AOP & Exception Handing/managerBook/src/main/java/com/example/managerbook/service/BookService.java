package com.example.managerbook.service;
import com.example.managerbook.model.Book;
import com.example.managerbook.repository.IRepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IRepositoryBook repository;
    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }
    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }
    public Integer stockQuantity(int id){
        return repository.stockQuantity(id);
    }
    @Override
    public void save(Book book) {
        repository.save(book);
    }

}
