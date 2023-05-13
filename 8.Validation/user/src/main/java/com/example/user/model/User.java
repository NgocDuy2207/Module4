package com.example.user.model;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "can not be empty")
    @Column(name = "first_Name", columnDefinition = "varchar(50)")
    private String firstName;
    @NotBlank(message = "can not be empty")
    @Column(name = "last_Name", columnDefinition = "varchar(50)")
    private String lastName;
    @NotNull(message = "phone shouldn't be null")
    @Column(name = "phone_Number", columnDefinition = "int")
    @Pattern(regexp = "^\\d{10}$", message = "invalid phone number entered")
    private String phoneNumber;

    @Min(value = 18, message = "Age should not be less than 18")
    @Column(name = "age", columnDefinition = "int")
    private Integer age;
    @NotBlank(message = "can not be empty")
    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
    @NotBlank(message = "can not be empty")
    @Column(name = "pass_Word", columnDefinition = "varchar(255)")
    private String passWord;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String phoneNumber, Integer age, String email, String passWord) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if(!user.firstName.matches("^[A-Za-z]{5,45}$")) {
            errors.rejectValue("firstName", "", "FirstName không đúng định dạng");
        }
        if(!user.lastName.matches("^[A-Za-z]{5,45}$")) {
            errors.rejectValue("firstName", "", "LastName không đúng định dạng");
        }
    }
}
