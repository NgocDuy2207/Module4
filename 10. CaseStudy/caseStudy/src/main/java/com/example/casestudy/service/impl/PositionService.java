package com.example.casestudy.service.impl;

import com.example.casestudy.model.employeeModel.Position;
import com.example.casestudy.repository.IRepositoryPosition;
import com.example.casestudy.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IRepositoryPosition repositoryPosition;
    @Override
    public List<Position> getAll() {
        return repositoryPosition.findAll();
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public void delete(int id) {

    }
}
