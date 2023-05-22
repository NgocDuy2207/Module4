package com.example.casestudy.model.dto;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Validator;


public class RoomCreateDTO extends FacilityCreateDTO implements Validator {
    private String facilityFree;
    public RoomCreateDTO(){

    }
    public RoomCreateDTO(String name, Integer area, Double cost, Integer maxPeople, RentType rentType, String facilityFree) {
        super(name, area, cost, maxPeople, rentType);
        this.facilityFree = facilityFree;
    }
    public String getFacilityFree() {
        return facilityFree;
    }
    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
