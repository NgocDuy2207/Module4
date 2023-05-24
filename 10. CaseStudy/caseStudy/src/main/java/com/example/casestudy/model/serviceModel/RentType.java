package com.example.casestudy.model.serviceModel;

import javax.persistence.*;

@Entity
public class RentType {
    @Id
    @Column(name = "id", columnDefinition = "int")
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;

    public RentType() {
    }

    public RentType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
