package com.example.casestudy.model.employeeModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "USER_UK", columnNames = "user_name") })
public class User {
    @Id
    @Column( name = "user_name", length = 36, nullable = false)
    private String userName;
    @Column(name = "pass_word", columnDefinition = "varchar(255)", length = 120, nullable = false)
    private String passWord;

}
