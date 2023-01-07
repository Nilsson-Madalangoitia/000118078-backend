package com.example.id000118078backend.domain.services;

import com.example.id000118078backend.domain.entities.CentroTuristico;

import java.util.List;

public interface CentroTuristicoService {
    CentroTuristico create(CentroTuristico centroTuristico);
    List<CentroTuristico> getAll();
    List<CentroTuristico> getByTipo(String tipo);
    List<CentroTuristico> getByTarifaMenorQue(float tarifa);
    List<CentroTuristico> getByTarifaMayorQue(float tarifa);

}
