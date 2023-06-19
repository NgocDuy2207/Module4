package com.example.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column()
    private String idScore;

    @Column()
    private Integer point;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "id_subject")
    private Subject subject;

}
