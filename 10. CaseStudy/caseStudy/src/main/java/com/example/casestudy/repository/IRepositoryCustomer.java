package com.example.casestudy.repository;
import com.example.casestudy.model.customerModel.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional

public interface IRepositoryCustomer extends PagingAndSortingRepository<Customer, Integer> {

}
