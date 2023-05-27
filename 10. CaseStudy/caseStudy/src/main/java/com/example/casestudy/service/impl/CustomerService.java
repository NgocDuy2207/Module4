package com.example.casestudy.service.impl;
import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.repository.IRepositoryCustomer;
import com.example.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private IRepositoryCustomer repository;
    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
