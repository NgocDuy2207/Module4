package com.example.ket_thuc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    private Integer id;
    @Column()
    private String maKh;
    @Column()
    private String tenKh;
    @Column()
    private String Sdt;
    @Column()
    private String email;

}
