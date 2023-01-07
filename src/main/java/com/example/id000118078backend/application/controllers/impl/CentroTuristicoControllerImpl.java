package com.example.id000118078backend.application.controllers.impl;

import com.example.id000118078backend.application.controllers.CentroTuristicoController;
import com.example.id000118078backend.domain.entities.CentroTuristico;
import com.example.id000118078backend.domain.services.CentroTuristicoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CentroTuristicoControllerImpl implements CentroTuristicoController {
    @Autowired
    private CentroTuristicoService centroTuristicoService;
    @Override
    public boolean registrar(CentroTuristico centroTuristico) {
        this.centroTuristicoService.create(centroTuristico);
        return true;
    }

    @Override
    public List<CentroTuristico> listAll() {
        return this.centroTuristicoService.getAll();
    }

    @Override
    public List<CentroTuristico> listByTipo(String tipo) {
        return this.centroTuristicoService.getByTipo(tipo);
    }

    @Override
    public List<CentroTuristico> listByTarifaLesserThan(float tarifa) {
        return this.centroTuristicoService.getByTarifaMenorQue(tarifa);
    }

    @Override
    public List<CentroTuristico> listByTarifaGreaterThan(float tarifa) {
        return this.centroTuristicoService.getByTarifaMayorQue(tarifa);
    }
}
