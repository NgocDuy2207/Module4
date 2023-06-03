package com.example.casestudy.service.impl;

import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.repository.IRepositoryFacility;
import com.example.casestudy.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
