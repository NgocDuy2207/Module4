package com.example.casestudy.dto;

import com.example.casestudy.model.customerModel.CustomerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@NoArgsConstructor
@Setter
@Getter

public class CustomerCreateDTO implements Validator {

    private CustomerType customerType;
    @NotBlank(message = "not black")
    // chữ các đầu viết hoa, còn lại viết thường có dấu
    @Pattern(regexp = "^(?!.*\\d)(\\p{Lu}\\p{Ll}*)(\\s\\p{Lu}\\p{Ll}*)*$")
    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDay;
    private Boolean gender;
    @NotBlank(message = "not black")
    @Pattern(regexp = "^([0-9]{9}$|^ [0-9]{12})$")
    private String idCard;
    @NotBlank(message = "not black")
    @Pattern(regexp = "^(090|091|84[+]90|84[+]91)[0-9]{7}$")
    private String phoneNumber;
    @NotBlank(message = "not black")
    @Pattern(regexp = "^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
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
