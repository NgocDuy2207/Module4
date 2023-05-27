package com.example.casestudy.model.employeeModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "day_of_birth", columnDefinition = "DATE")
    private LocalDate dayOfBirth;
    @Column(name = "id_card", columnDefinition = "varchar(45)")
    private String idCard;
    @Column(name = "salary", columnDefinition = "double")
    private Double salary;
    @Column(name = "number_phone", columnDefinition = "varchar(45)")
    private String numberPhone;
    @Column(name = "email", columnDefinition = "varchar(45)")
    private String email;
    @Column(name = "address", columnDefinition = "varchar(45)")
    private String address;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "education_degree_id")
   private EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(name = "divisiton_id")
    private Division division;
    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;
}
