package com.example.lab2_20204205.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name="seguro")
public class seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private int id;
    @Column(nullable = false)
    private String empresa_aseguradora;
    @Column(nullable = false)
    private BigDecimal cobertura_maxima;
    private BigDecimal tarifa;
}
