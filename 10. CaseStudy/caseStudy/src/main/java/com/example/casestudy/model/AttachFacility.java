package com.example.casestudy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@Entity
@Setter
@Getter
public class AttachFacility {
    @Id
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(45)")
    private String name;
    @Column(columnDefinition = "double")
    private Double cost;
    @Column(columnDefinition = "varchar(10)")
    private String unit;
    @Column(columnDefinition = "varchar(50)")
    private String status;
}
