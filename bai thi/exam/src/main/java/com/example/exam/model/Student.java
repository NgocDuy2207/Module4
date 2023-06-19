package com.example.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String idStudent;
    @Column
    private String name;
    @Column(name = "gender")
    private Boolean gender;
    @Column()
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;

}
