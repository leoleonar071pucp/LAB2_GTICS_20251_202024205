package com.example.lab2_20204205.entity;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name="sede")
public class sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private int idsede;
    @Column(nullable = false)
    private String distrito;
    @Column(nullable = false)
    private String direccion;
}