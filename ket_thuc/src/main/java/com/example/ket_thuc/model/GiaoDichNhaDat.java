package com.example.ket_thuc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiaoDichNhaDat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank()
    @Column()
    @Pattern(regexp = "^(MGD-[0-9]{4})")
    private String maGiaoDich;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang maKh;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column()
    private LocalDate day;
    @NotBlank()
    @Column()
    private String loaiDicVu;
   @Min(value = 500000, message = "giá phải lớn hơn hoặc bằng 500000")
   @Column()
   @NotNull()
    private Double donGia;
    @Min(value = 20, message = "diện tích phải lớn hơn hoặc bằng 20")
    @Column()
    @NotNull()
   private Double dienTich;

}
