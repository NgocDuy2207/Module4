package com.example.casestudy.service.impl;

import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.repository.IRepositoryFacility;
import com.example.casestudy.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IRepositoryFacility repository;

    @Override
    public List<Facility> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Facility facility) {
        repository.save(facility);
    }

    @Override
    public void delete(int id) {
      repository.deleteById(id);
    }

    @Override
    public Facility findById(int id) {
        return null;
    }

    @Override
    public Page<Facility> listAll(int page) {
        return repository.findAll(Pageable.ofSize(5).withPage(page));
    }

    @Override
    public Page<Facility> searchService(Integer type, int page) {
        return repository.findAllByFacilityType_Id(Pageable.ofSize(2).withPage(page),type);
    }
}
