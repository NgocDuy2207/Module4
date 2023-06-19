package com.example.managerbook.dto;
import com.example.managerbook.model.Book;
import com.example.managerbook.model.Student;

import java.util.List;


public class DTO {
    private Book bookID;
    private Student studentsID;

    public DTO(){

    }

    public DTO(Book bookID, Student studentsID) {
        this.bookID = bookID;
        this.studentsID = studentsID;
    }

    public Book getBookID() {
        return bookID;
    }

    public void setBookID(Book bookID) {
        this.bookID = bookID;
    }

    public Student getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(Student studentsID) {
        this.studentsID = studentsID;
    }
}
