package com.example.ket_thuc.repository;
import com.example.ket_thuc.model.GiaoDichNhaDat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryGiaoDichNhaDat extends JpaRepository<GiaoDichNhaDat, Integer> {
    Page<GiaoDichNhaDat> findAllByMaKh_TenKhLike(Pageable pageable, String name);
    Page<GiaoDichNhaDat> findAllByLoaiDicVuLike(Pageable pageable, String LoaiDichVu);
    Page<GiaoDichNhaDat> findAllByMaKh_TenKhOrLoaiDicVuLike(Pageable pageable, String ten, String loaiDichVu);

}
