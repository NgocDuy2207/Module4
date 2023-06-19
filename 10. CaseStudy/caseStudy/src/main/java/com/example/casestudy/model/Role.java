package com.example.casestudy.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Role {
    @Id
    @Column(name = "role_id")
    private Integer id;
    @Column(name = "role_name", columnDefinition = "varchar(255)")
    private String name;
}
