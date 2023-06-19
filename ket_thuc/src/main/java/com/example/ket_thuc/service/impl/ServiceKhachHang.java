package com.example.ket_thuc.service.impl;

import com.example.ket_thuc.model.KhachHang;
import com.example.ket_thuc.repository.IRepositoryGiaoDichNhaDat;
import com.example.ket_thuc.repository.IRepositoryKhachHang;
import com.example.ket_thuc.service.IServiceKhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceKhachHang implements IServiceKhachHang {
    @Autowired
    private IRepositoryKhachHang repositoryKhachHang;
    @Override
    public List<KhachHang> listAll() {
        return repositoryKhachHang.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public KhachHang finById(int id) {
        return repositoryKhachHang.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findBy(int page, String name) {
        return null;
    }
}
