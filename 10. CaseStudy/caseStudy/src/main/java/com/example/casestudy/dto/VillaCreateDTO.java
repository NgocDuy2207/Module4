package com.example.casestudy.dto;

import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class VillaCreateDTO implements Validator {
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
    private String standardRoom;
    @NotBlank(message = "not blank")
    private String descriptionOtherConvenience;

    @Min(value = 10 ,message = "poolArea can not be less than 10")
    private Double poolArea;

    @Min(value = 2 ,message = "numberOfFloors can not be less than 2")
    private Integer numberOfFloors;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    public VillaCreateDTO() {
    }

    public VillaCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
