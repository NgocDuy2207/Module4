package com.example.casestudy.model.dto;

import com.example.casestudy.model.customerModel.CustomerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@NoArgsConstructor
@Setter
@Getter

public class CustomerCreateDTO implements Validator {

    private CustomerType customerType;
    @NotBlank(message = "not black")
    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;
    private Boolean gender;
    @NotBlank(message = "not black")

    private String idCard;
    @NotBlank(message = "not black")
    private String phoneNumber;
    @NotBlank(message = "not black")
    private String email;
    @NotBlank(message = "not black")
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
