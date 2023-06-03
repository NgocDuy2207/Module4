package com.example.casestudy.service.impl;

import com.example.casestudy.model.customerModel.CustomerType;
import com.example.casestudy.repository.IRepositoryCustomerType;
import com.example.casestudy.service.ICustomerTypeService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private IRepositoryCustomerType repositoryCustomerType;
    @Override
    public List<CustomerType> getAll() {
        return repositoryCustomerType.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        repositoryCustomerType.save(customerType);
    }

    @Override
    public void delete(int id) {
        repositoryCustomerType.deleteById(id);
    }

    @Override
    public CustomerType findById(int id) {
        return null;
    }
}
