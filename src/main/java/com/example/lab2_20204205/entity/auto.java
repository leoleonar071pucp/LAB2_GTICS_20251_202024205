package com.example.lab2_20204205.entity;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name="auto")
public class auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private int idauto;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private int kilometraje;
    @ManyToOne
    @JoinColumn(name = "idsede")
    private sede sede;
    private BigDecimal costo_por_dia;

}
