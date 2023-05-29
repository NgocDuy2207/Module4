package com.example.casestudy.service;

import com.example.casestudy.model.customerModel.Customer;
import org.springframework.data.domain.Page;

public interface ICustomerService extends IService<Customer>{
    Page<Customer> listAll(int page);
}
