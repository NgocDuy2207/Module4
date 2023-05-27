package com.example.casestudy.model.employeeModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Position {
    @Id
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;
}
