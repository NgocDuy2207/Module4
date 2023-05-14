package com.example.managerbook.service;

import com.example.managerbook.model.BorrowBookOfStudent;
import com.example.managerbook.repository.IRepositoryBorrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class BorrowService implements IBorrow{
    @Autowired
    private IRepositoryBorrow repository;


    @Override
    public List<BorrowBookOfStudent> add(BorrowBookOfStudent bookOfStudent) {
        return Collections.singletonList(repository.save(bookOfStudent));
    }
}
