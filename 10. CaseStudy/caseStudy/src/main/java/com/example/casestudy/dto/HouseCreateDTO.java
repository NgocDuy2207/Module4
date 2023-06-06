package com.example.casestudy.dto;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HouseCreateDTO  implements Validator {
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

    @Min(value = 2 ,message = "numberOfFloors can not be less than 2")
    private Integer numberOfFloors;
    @NotNull(message = "not null")
    private String facilityFree;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    public HouseCreateDTO() {
    }

    public HouseCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String standardRoom, String descriptionOtherConvenience, Integer numberOfFloors, String facilityFree) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloors = numberOfFloors;
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
