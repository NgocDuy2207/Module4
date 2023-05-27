package com.example.casestudy.model;

import com.example.casestudy.model.customerModel.Customer;
import com.example.casestudy.model.employeeModel.Employee;
import com.example.casestudy.model.serviceModel.Facility;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Contract {
    @Id
    private Integer id;
    @Column(columnDefinition = "dateTime")
    private LocalDate startDay;
    @Column(columnDefinition = "dateTime")
    private LocalDate endDay;
    @Column(columnDefinition = "double")
    private Double deposit;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

}
