package com.example.managerbook.model;

import javax.persistence.*;

@Entity
public class BorrowBookOfStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;
    @Column(name = "borrow_code", columnDefinition = "varchar(50)")
    private String borrowCode;
    @Column(name = "status", columnDefinition = "Tinyint")

    private Boolean status;

    public BorrowBookOfStudent() {
    }

    public BorrowBookOfStudent(int id, Book book, Student student, String borrowCode, Boolean status) {
        this.id = id;
        this.book = book;
        this.student = student;
        this.borrowCode = borrowCode;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getBorrowCode() {
        return borrowCode;
    }

    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
