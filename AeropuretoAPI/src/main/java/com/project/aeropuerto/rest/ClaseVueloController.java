package com.project.aeropuerto.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.ClaseVuelo;
import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.modelRequest.ClaseVueloRequest;
import com.project.aeropuerto.services.ClaseVueloService;

@RestController
@RequestMapping("/clases-vuelo")
public class ClaseVueloController {

    @Autowired
    private ClaseVueloService claseVueloService;

    @GetMapping("/getClases")
    public List<ClaseVuelo> getClaseVuelos() {
        return claseVueloService.getClaseVuelos();
    }

    
    @PostMapping("/crear")
    public ClaseVuelo createClaseVuelo(@RequestBody ClaseVueloRequest claseVueloRequest) {
        return claseVueloService.createClaseVuelo(claseVueloRequest);
    }
}
