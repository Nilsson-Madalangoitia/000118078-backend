package com.example.id000118078backend.infrastructure.repositories.impljpa;

import com.example.id000118078backend.domain.entities.CentroTuristico;
import com.example.id000118078backend.domain.repositories.CentroTuristicoRepository;
import com.example.id000118078backend.infrastructure.repositories.CentroTuristicoJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CentroTuristicoJpaRepositoryImpl implements CentroTuristicoRepository {
    @Autowired
    private CentroTuristicoJpaRepository centroTuristicoJpaRepository;

    @Override
    public CentroTuristico save(CentroTuristico centroTuristico) {
        return this.centroTuristicoJpaRepository.save(centroTuristico);
    }

    @Override
    public List<CentroTuristico> listAll() {
        return this.centroTuristicoJpaRepository.findAll();
    }

    @Override
    public List<CentroTuristico> listByTipo(String tipo) {
        return this.centroTuristicoJpaRepository.findByTipoIgnoreCase(tipo);
    }

    @Override
    public List<CentroTuristico> listByTarifaLessThan(float tarifa) {
        return this.centroTuristicoJpaRepository.findByTarifaLessThan(tarifa);
    }

    @Override
    public List<CentroTuristico> listByTarifaGreaterThan(float tarifa) {
        return this.centroTuristicoJpaRepository.findByTarifaGreaterThan(tarifa);
    }
}
