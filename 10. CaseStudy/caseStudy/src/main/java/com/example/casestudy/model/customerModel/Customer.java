package com.example.casestudy.model.customerModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;
    @Column(name = "name", columnDefinition = "varchar(45)")
    private String name;
    @Column(name = "day_of_birth", columnDefinition = "date")
    private LocalDate birthDay;
    @Column(name = "gender", columnDefinition = "bit")
    private Boolean gender;
    @Column(name = "id_card", columnDefinition = "varchar(45)")
    private String idCard;
    @Column(name = "phone_number", columnDefinition = "varchar(45)")
    private String phoneNumber;
    @Column(name = "email", columnDefinition = "varchar(45)")
    private String email;
    @Column(name = "address", columnDefinition = "varchar(45)")
    private String address;

    public Customer(Integer id, CustomerType customerType, String name, LocalDate birthDay, Boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
