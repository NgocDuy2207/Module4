package com.example.managerbook.service;
import com.example.managerbook.model.BorrowBookOfStudent;
import com.example.managerbook.repository.IRepositoryBorrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowService implements IBorrow{
    @Autowired
    private IRepositoryBorrow repository;

    @Override
    public BorrowBookOfStudent create(BorrowBookOfStudent bookOfStudent) {

        return repository.save(bookOfStudent);
    }
}
