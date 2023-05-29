package com.example.casestudy.service.impl;

import com.example.casestudy.model.employeeModel.EducationDegree;
import com.example.casestudy.repository.IRepositoryEducationDegree;
import com.example.casestudy.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IRepositoryEducationDegree repositoryEducationDegree;
    @Override
    public List<EducationDegree> getAll() {
        return repositoryEducationDegree.findAll();
    }

    @Override
    public void save(EducationDegree educationDegree) {

    }

    @Override
    public void delete(int id) {

    }
}
