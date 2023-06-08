package com.example.casestudy.repository;
import com.example.casestudy.model.serviceModel.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRepositoryFacility extends JpaRepository<Facility,Integer> {

    Page<Facility> findAllByFacilityType_Id(Pageable pageable,Integer type);

}
