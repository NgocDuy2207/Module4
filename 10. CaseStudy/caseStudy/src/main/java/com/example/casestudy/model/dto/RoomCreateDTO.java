package com.example.casestudy.model.dto;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class RoomCreateDTO  implements Validator {
    @NotBlank(message = "not blank")
    private String name;

    @Min(value = 0, message = "phải lớn hơn không")
    private Integer area;
    @Min(value = 0, message = "phải lớn hơn không")
    private Double cost;
    @Min(value = 0, message = "phải lớn hơn không")
    private Integer maxPeople;
    private RentType rentType;
    @NotBlank(message = "not blank")
    private String facilityFree;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    public RoomCreateDTO() {
    }

    public RoomCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String facilityFree) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.facilityFree = facilityFree;
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

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
