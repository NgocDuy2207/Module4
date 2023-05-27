package com.example.casestudy.model.dto;

import com.example.casestudy.model.customerModel.CustomerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import java.time.LocalDate;
@NoArgsConstructor
@Setter
@Getter

public class CustomerCreateDTO implements Validator {

    private CustomerType customerType;
    private String name;
    private LocalDate birthDay;
    private Boolean gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;

    public CustomerCreateDTO(CustomerType customerType, String name, LocalDate birthDay, Boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.customerType = customerType;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
