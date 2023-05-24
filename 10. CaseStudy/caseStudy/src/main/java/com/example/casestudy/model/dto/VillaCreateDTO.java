package com.example.casestudy.model.dto;

import com.example.casestudy.model.serviceModel.Facility;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class VillaCreateDTO extends FacilityCreateDTO implements Validator {
    @NotBlank(message = "not blank")
    private String standardRoom;
    @NotBlank(message = "not blank")
    private String descriptionOtherConvenience;

    @Min(value = 10 ,message = "poolArea can not be less than 10")
    private Double poolArea;

    @Min(value = 2 ,message = "numberOfFloors can not be less than 2")
    private Integer numberOfFloors;



    public VillaCreateDTO(){

    }

    public VillaCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors) {
        super(name, area, cost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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
