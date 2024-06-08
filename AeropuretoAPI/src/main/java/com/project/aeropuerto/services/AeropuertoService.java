package com.project.aeropuerto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Aeropuerto;
import com.project.aeropuerto.modelRequest.AeropuertoRequest;
import com.project.aeropuerto.repository.AeropuertoRepository;

@Service
public class AeropuertoService {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public Aeropuerto createAeropuerto(AeropuertoRequest aeropuertoRequest) {
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setNombre(aeropuertoRequest.getNombre());
        aeropuerto.setCiudad(aeropuertoRequest.getCiudad());
        aeropuerto.setPais(aeropuertoRequest.getPais());
        return aeropuertoRepository.save(aeropuerto);
    }
    
    public List<Aeropuerto> getAeropuertos(){
    	return aeropuertoRepository.findAll();
    }
}
