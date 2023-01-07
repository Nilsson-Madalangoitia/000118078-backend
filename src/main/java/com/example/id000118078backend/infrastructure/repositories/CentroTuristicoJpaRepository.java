package com.example.id000118078backend.infrastructure.repositories;

import com.example.id000118078backend.domain.entities.CentroTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CentroTuristicoJpaRepository extends JpaRepository<CentroTuristico, Long> {
    List<CentroTuristico> findByTipoIgnoreCase(String tipo);
    List<CentroTuristico> findByTarifaLessThan(float tarifa);
    List<CentroTuristico> findByTarifaGreaterThan(float tarifa);
}
