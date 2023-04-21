package com.example.demowithtests.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "passports")
@Data
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String serialNumber;

    private String firstName;

    private String secondName;

    private LocalDateTime birthDate;

    private LocalDateTime expirationDate;

    @OneToOne(mappedBy = "passport")
    private Employee employee;

    private Boolean isDeleted = Boolean.FALSE;

    //    private Boolean isFree;
    private Boolean isIssued;

    private Boolean isExpired;
}
