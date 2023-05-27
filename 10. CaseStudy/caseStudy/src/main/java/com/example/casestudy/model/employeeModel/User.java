package com.example.casestudy.model.employeeModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String userName;
    @Column(name = "pass_Word", columnDefinition = "varchar(255)")
    private String passWord;

}
