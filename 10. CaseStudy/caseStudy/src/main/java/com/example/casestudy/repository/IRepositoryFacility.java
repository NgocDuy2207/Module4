package com.example.casestudy.repository;

import com.example.casestudy.model.serviceModel.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IRepositoryFacility extends JpaRepository<Facility,Integer> {
}
