package com.example.managerbook.repository;

import com.example.managerbook.model.BorrowBookOfStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryBorrow extends JpaRepository<BorrowBookOfStudent, Integer> {
}
