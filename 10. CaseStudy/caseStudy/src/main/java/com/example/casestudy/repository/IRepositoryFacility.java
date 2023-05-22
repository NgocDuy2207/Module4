package com.example.casestudy.repository;

import com.example.casestudy.model.serviceModel.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryFacility extends JpaRepository<Facility,Integer> {
}
