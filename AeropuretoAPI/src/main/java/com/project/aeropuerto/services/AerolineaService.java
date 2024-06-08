package com.project.aeropuerto.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Aerolinea;
import com.project.aeropuerto.model.Aeronave;
import com.project.aeropuerto.repository.AerolineaRepository;
import com.project.aeropuerto.repository.AeronaveRepository;

import java.util.Collections;
import java.util.List;

@Service
public class AerolineaService {

    @Autowired
    private AerolineaRepository aerolineaRepository;

    @Autowired
    private AeronaveRepository aeronaveRepository;

    public Aerolinea createAerolinea(String nombre, String modeloAvion) {
        Aerolinea aerolinea = new Aerolinea();
        aerolinea.setNombre(nombre);

        Aeronave aeronave = new Aeronave();
        aeronave.setModelo(modeloAvion);
        aeronave.setEstado("Activo");
        aeronave.setAerolinea(aerolinea);

        aerolinea.setAeronaves(Collections.singletonList(aeronave));

        return aerolineaRepository.save(aerolinea);
    }
    
    public List<Aerolinea> obtenerTodasAreolineas(){
    	return aerolineaRepository.findAll();
    }
}
