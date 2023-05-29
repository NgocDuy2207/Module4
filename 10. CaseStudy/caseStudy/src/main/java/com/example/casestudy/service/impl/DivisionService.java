package com.example.casestudy.service.impl;

import com.example.casestudy.model.employeeModel.Division;
import com.example.casestudy.repository.IRepositoryDivision;
import com.example.casestudy.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;
@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IRepositoryDivision repositoryDivision;
    @Override
    public List<Division> getAll() {
        return repositoryDivision.findAll();
    }

    @Override
    public void save(Division division) {

    }

    @Override
    public void delete(int id) {

    }
}
