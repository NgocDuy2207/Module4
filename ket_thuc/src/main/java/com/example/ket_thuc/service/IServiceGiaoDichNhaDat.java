package com.example.ket_thuc.service;

import com.example.ket_thuc.model.GiaoDichNhaDat;
import org.springframework.data.domain.Page;

public interface IServiceGiaoDichNhaDat {
    Page<GiaoDichNhaDat> listAll(int page);
    void save(GiaoDichNhaDat questionContent);
    void delete(int id);
    GiaoDichNhaDat finById(int id);
    Page<GiaoDichNhaDat> findLoaiDichVu(int page, String loaiDichVu);
    Page<GiaoDichNhaDat> findByTenKhachHang(int page, String name);
    Page<GiaoDichNhaDat> findTenKhAndLoaiDichVu(int page, String ten, String loaiDichVu);
}
