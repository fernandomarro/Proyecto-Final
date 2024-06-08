package com.project.aeropuerto.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.Pasajero;
import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.model.Vuelo;
import com.project.aeropuerto.modelRequest.PasajeroRequest;
import com.project.aeropuerto.services.PasajeroService;

@RestController
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping("/getPasajeros")
    public List<Pasajero> getPasajeros() {
        return pasajeroService.getPasajeros();
    }
    
    @PostMapping("/crear")
    public Pasajero crearPasajero(@RequestBody PasajeroRequest pasajeroRequest) {
        
       
        return pasajeroService.createPasajero(
        		pasajeroRequest.getUsuarioId(),
        		pasajeroRequest.getVueloId(),
        		pasajeroRequest.getAsiento(),
        		pasajeroRequest.getCantidadMaletas()
        		);
    }
    
    @GetMapping("getPasajero/{id}")
    public Optional<Pasajero> getRoleById(@PathVariable Long id) {
        return pasajeroService.getPasajero(id);
    }

    
}
