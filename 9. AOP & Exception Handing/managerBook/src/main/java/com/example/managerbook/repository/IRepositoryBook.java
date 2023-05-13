package com.example.managerbook.repository;
import com.example.managerbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface IRepositoryBook extends JpaRepository<Book, Integer> {
}
