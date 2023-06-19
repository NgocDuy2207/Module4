package com.example.productmanagement.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product", columnDefinition = "Integer")
    private int id;
    @Column(name = "code_product", columnDefinition = "varchar(50)")
    private String code;
    @Column(name = "name_product", columnDefinition = "varchar(50)")
    private String name;
    private double price;
    private  String manufacturer;

    public Product(){

    }

    public Product(int id, String code, String name, double price, String manufacturer) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
