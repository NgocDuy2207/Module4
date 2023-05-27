package com.example.casestudy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Entity
@Setter
@Getter
public class ContractDetail {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "attach_facility_id")
    private AttachFacility attachFacility;
    @Column(columnDefinition = "int")
    private Integer quantity;
}
