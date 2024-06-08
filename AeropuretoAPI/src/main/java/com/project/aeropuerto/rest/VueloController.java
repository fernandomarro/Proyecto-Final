package com.project.aeropuerto.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.aeropuerto.model.Aeropuerto;
import com.project.aeropuerto.model.Vuelo;
import com.project.aeropuerto.modelRequest.VueloRequest;
import com.project.aeropuerto.services.VueloService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/getVuelos")
    public List<Vuelo> getVuelos(){
    	return vueloService.getVuelos();
    }
    
    
    @PostMapping("/crear")
    public Vuelo createVuelo(@RequestBody VueloRequest vueloRequest) {
        return vueloService.createVuelo(
                vueloRequest.getAerolineaId(),
                vueloRequest.getAeropuertoSalidaId(),
                vueloRequest.getAeropuertoLlegadaId(),
                vueloRequest.getClaseVueloId(),
                vueloRequest.getHoraSalida(),
                vueloRequest.getHoraLlegada()
        );
    }
}
