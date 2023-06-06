package com.example.casestudy.service;

import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.model.serviceModel.Facility;
import org.springframework.data.domain.Page;



public interface IFacilityService extends IService<Facility> {
    Page<Facility> listAll(int page);
}
