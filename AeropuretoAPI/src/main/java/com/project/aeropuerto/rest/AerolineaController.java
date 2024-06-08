package com.project.aeropuerto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.Aerolinea;
import com.project.aeropuerto.model.Persona;
import com.project.aeropuerto.modelRequest.AerolineaRequest;
import com.project.aeropuerto.services.AerolineaService;

@RestController
@RequestMapping("/aerolineas")
public class AerolineaController {

    @Autowired
    private AerolineaService aerolineaService;
    
    @GetMapping
	private List<Aerolinea> listarTodasAreolineas (){
		return aerolineaService.obtenerTodasAreolineas();
	}
    
    @PostMapping("/crear")
    public Aerolinea createAerolinea(@RequestBody AerolineaRequest aerolineaRequest) {
        return aerolineaService.createAerolinea(aerolineaRequest.getNombre(), aerolineaRequest.getModeloAvion());
    }
}
