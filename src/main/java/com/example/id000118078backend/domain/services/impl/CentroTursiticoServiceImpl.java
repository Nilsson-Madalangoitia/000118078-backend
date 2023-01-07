package com.example.id000118078backend.domain.services.impl;

import com.example.id000118078backend.domain.entities.CentroTuristico;
import com.example.id000118078backend.domain.repositories.CentroTuristicoRepository;
import com.example.id000118078backend.domain.services.CentroTuristicoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroTursiticoServiceImpl implements CentroTuristicoService {
    @Autowired
    CentroTuristicoRepository centroTuristicoRepository;
    @Override
    public CentroTuristico create(CentroTuristico centroTuristico) {
        return this.centroTuristicoRepository.save(centroTuristico);
    }

    @Override
    public List<CentroTuristico> getAll() {
        return this.centroTuristicoRepository.listAll();
    }

    @Override
    public List<CentroTuristico> getByTipo(String tipo) {
        return this.centroTuristicoRepository.listByTipo(tipo);
    }

    @Override
    public List<CentroTuristico> getByTarifaMenorQue(float tarifa) {
        return this.centroTuristicoRepository.listByTarifaLessThan(tarifa);
    }

    @Override
    public List<CentroTuristico> getByTarifaMayorQue(float tarifa) {
        return this.centroTuristicoRepository.listByTarifaGreaterThan(tarifa);
    }
}
