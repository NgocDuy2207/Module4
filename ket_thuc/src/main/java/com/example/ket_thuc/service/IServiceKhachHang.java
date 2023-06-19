package com.example.ket_thuc.service;

import com.example.ket_thuc.model.KhachHang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IServiceKhachHang {
    List<KhachHang> listAll();
    void save(KhachHang khachHang);
    void delete(int id);
    KhachHang finById(int id);
    Page<KhachHang> findBy(int page, String name);
}
