package com.example.lab2_20204205.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name="credenciales_usuario")
public class credenciales_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private int idusuario;
    @Column(nullable = false)
    private String correo;
    @Column(nullable = false)
    private String contraseña_encriptada;

}
