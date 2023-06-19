package com.example.ket_thuc.service.impl;

import com.example.ket_thuc.model.GiaoDichNhaDat;
import com.example.ket_thuc.repository.IRepositoryGiaoDichNhaDat;
import com.example.ket_thuc.repository.IRepositoryKhachHang;
import com.example.ket_thuc.service.IServiceGiaoDichNhaDat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class ServiceGiaoDichNhaDat implements IServiceGiaoDichNhaDat {

    @Autowired
    private IRepositoryGiaoDichNhaDat repositoryGiaoDichNhaDat;
    @Override
    public Page<GiaoDichNhaDat> listAll(int page) {
        return repositoryGiaoDichNhaDat.findAll(Pageable.ofSize(3).withPage(page));
    }

    @Override
    public void save(GiaoDichNhaDat giaoDichNhaDat) {
            repositoryGiaoDichNhaDat.save(giaoDichNhaDat);
    }

    @Override
    public void delete(int id) {
            repositoryGiaoDichNhaDat.deleteById(id);
    }

    @Override
    public GiaoDichNhaDat finById(int id) {
        return repositoryGiaoDichNhaDat.findById(id).orElse(null);
    }

    @Override
    public Page<GiaoDichNhaDat> findLoaiDichVu(int page, String loaiDichVu) {
        return repositoryGiaoDichNhaDat.findAllByLoaiDicVuLike(Pageable.ofSize(3).withPage(page), loaiDichVu);
    }

    @Override
    public Page<GiaoDichNhaDat> findByTenKhachHang(int page, String name) {
        return repositoryGiaoDichNhaDat.findAllByMaKh_TenKhLike(Pageable.ofSize(3).withPage(page), name);
    }



    @Override
    public Page<GiaoDichNhaDat> findTenKhAndLoaiDichVu(int page, String ten, String loaiDichVu) {
        return repositoryGiaoDichNhaDat.findAllByMaKh_TenKhOrLoaiDicVuLike(Pageable.ofSize(3).withPage(page), ten, loaiDichVu);
    }
}
