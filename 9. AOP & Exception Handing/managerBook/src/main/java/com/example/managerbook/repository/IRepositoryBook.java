package com.example.managerbook.repository;
import com.example.managerbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IRepositoryBook extends JpaRepository<Book, Integer> {
    @Modifying
    @Query(value = "select b.quantity from book b where b.id = ?1", nativeQuery = true)
    Integer stockQuantity(int id);



}
