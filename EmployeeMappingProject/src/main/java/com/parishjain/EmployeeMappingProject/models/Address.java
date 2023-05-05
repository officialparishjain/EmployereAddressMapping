package com.parishjain.EmployeeMappingProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Address {

    // REFERENCING SIDE

    // INDEPENDENT TABLE

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addId;
    private String street;
    private String city;
    private String state;
    private String zipcode;

}
