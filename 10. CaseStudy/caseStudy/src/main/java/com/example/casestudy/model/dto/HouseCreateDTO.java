package com.example.casestudy.model.dto;

import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HouseCreateDTO extends FacilityCreateDTO implements Validator {
    @NotBlank(message = "not blank")
    private String standardRoom;
    @NotBlank(message = "not blank")
    private String descriptionOtherConvenience;
    @NotBlank(message = "not blank")
    @Min(value = 2 ,message = "numberOfFloors can not be less than 2")
    private Integer numberOfFloors;
    @NotNull(message = "not null")
    private String facilityFree;
    public HouseCreateDTO(){

    }

    public HouseCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String standardRoom, String descriptionOtherConvenience, Integer numberOfFloors, String facilityFree) {
        super(name, area, cost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
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

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
