package com.example.casestudy.service.impl;

import com.example.casestudy.model.serviceModel.RentType;
import com.example.casestudy.repository.IRepositoryRentType;
import com.example.casestudy.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRepositoryRentType repository;


    @Override
    public List<RentType> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(RentType rentType) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public RentType findById(int id) {
        return null;
    }
}
