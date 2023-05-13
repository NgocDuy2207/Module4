package com.example.managerbook.model;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "integer")
    private int idBook;
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String nameBook;
    @Column(name = "quantity", columnDefinition = "integer")
    private Integer quantity;
    public Book(){

    }

    public Book(int idBook, String nameBook, Integer quantity) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.quantity = quantity;

    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
