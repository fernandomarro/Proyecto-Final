package com.project.aeropuerto.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.Tripulacion;
import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.modelRequest.TripulacionRequest;
import com.project.aeropuerto.services.CrewService;

import java.util.List;

@RestController
@RequestMapping("/crew")
public class CrewController {

    @Autowired
    private CrewService crewService;

    @GetMapping("/available/{rolId}")
    public List<Usuario> getAvailableUsersByRole(@PathVariable Long rolId) {
        return crewService.getUsuariosPorRol(rolId);
    }
    
    @GetMapping("/verTripulaciones")
    public List<Tripulacion> getTripulaciones() {
        return crewService.getTripulaciones();
    }

    @PostMapping("/create")
    public Tripulacion createTripulacion(@RequestBody TripulacionRequest tripulacionRequest) {
        return crewService.createTripulacion(
                tripulacionRequest.getPilotoId(),
                tripulacionRequest.getCopilotoId(),
                tripulacionRequest.getIngenieroVueloId(),
                tripulacionRequest.getTripulantesCabinaIds()
        );
    }
}

