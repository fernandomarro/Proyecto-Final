package com.project.aeropuerto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.Aeropuerto;
import com.project.aeropuerto.modelRequest.AeropuertoRequest;
import com.project.aeropuerto.services.AeropuertoService;

@RestController
@RequestMapping("/aeropuertos")
public class AeropuertoController {

    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping("/getAeropuertos")
    public List<Aeropuerto> getAeropuertos(){
    	return aeropuertoService.getAeropuertos();
    }
    
    @PostMapping("/crear")
    public Aeropuerto createAeropuerto(@RequestBody AeropuertoRequest aeropuertoRequest) {
        return aeropuertoService.createAeropuerto(aeropuertoRequest);
    }
}

