package com.example.id000118078backend.application.controllers;


import com.example.id000118078backend.domain.entities.CentroTuristico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/centros")
public interface CentroTuristicoController {
    @PostMapping(produces = "application/json", consumes = "application/json")
    boolean registrar(@RequestBody CentroTuristico centroTuristico);
    @GetMapping(produces = "application/json")
    List<CentroTuristico> listAll();
    @GetMapping( path = "/by-tipo/{tipo}", produces = "application/json")
    List<CentroTuristico> listByTipo(@PathVariable("tipo") String tipo);
    @GetMapping( path = "/tarifa/menor-que/{tarifa}", produces = "application/json")
    List<CentroTuristico> listByTarifaLesserThan(
            @PathVariable("tarifa") float tarifa
    );
    @GetMapping( path = "/tarifa/mayor-que/{tarifa}", produces = "application/json")
    List<CentroTuristico> listByTarifaGreaterThan(
            @PathVariable("tarifa") float tarifa
    );
}
