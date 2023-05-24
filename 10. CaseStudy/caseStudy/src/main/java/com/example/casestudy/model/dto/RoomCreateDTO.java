package com.example.casestudy.model.dto;
import com.example.casestudy.model.serviceModel.RentType;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;


public class RoomCreateDTO extends FacilityCreateDTO implements Validator {
    @NotBlank(message = "not blank")
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
