package com.example.id000118078backend.domain.repositories;

import com.example.id000118078backend.domain.entities.CentroTuristico;

import java.util.List;

public interface CentroTuristicoRepository {
    CentroTuristico save(CentroTuristico centroTuristico);
    List<CentroTuristico> listAll();
    List<CentroTuristico> listByTipo(String tipo);
    List<CentroTuristico> listByTarifaLessThan(float tarifa);
    List<CentroTuristico> listByTarifaGreaterThan(float tarifa);
}
