package com.example.casestudy.model.dto;

import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.validation.constraints.NotBlank;


public class FacilityCreateDTO implements Validator {

    @NotBlank(message = "not blank")
    private String name;
    @NotBlank(message = "not blank")
    private Integer area;
    @NotBlank(message = "not blank")
    private Double cost;
    @NotBlank(message = "not blank")
    private Integer maxPeople;
    @NotBlank(message = "not blank")
    private RentType rentType;



    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    public FacilityCreateDTO() {
    }

    public FacilityCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}



