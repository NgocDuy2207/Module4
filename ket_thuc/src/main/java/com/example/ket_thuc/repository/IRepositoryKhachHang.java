package com.example.ket_thuc.repository;
import com.example.ket_thuc.model.GiaoDichNhaDat;
import com.example.ket_thuc.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositoryKhachHang extends JpaRepository<KhachHang, Integer> {







}
