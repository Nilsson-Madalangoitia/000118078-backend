package com.example.id000118078backend.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "centro_turistico")
@Data
public class CentroTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipo;
    private float tarifa;
    private Long distanciaCentroMetros;
}
