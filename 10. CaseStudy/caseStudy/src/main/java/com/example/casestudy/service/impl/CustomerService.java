package com.example.casestudy.service.impl;
import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.repository.IRepositoryCustomer;
import com.example.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private IRepositoryCustomer repository;

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void delete(int id) {
        Customer customer = findById(id);
        repository.delete(customer);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id).orElse(null);
    }


    @Override
    public Page<Customer> listAll(int page) {
        return repository.findAll(Pageable.ofSize(3).withPage(page));
    }
}
