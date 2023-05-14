package com.example.managerbook.service;

import com.example.managerbook.model.BorrowBookOfStudent;

import java.util.List;


public interface IBorrow {

    public List<BorrowBookOfStudent> add(BorrowBookOfStudent bookOfStudent);
}
