package com.project.aeropuerto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.ClaseVuelo;
import com.project.aeropuerto.modelRequest.ClaseVueloRequest;
import com.project.aeropuerto.repository.ClaseVueloRepository;

@Service
public class ClaseVueloService {

    @Autowired
    private ClaseVueloRepository claseVueloRepository;

    public ClaseVuelo createClaseVuelo(ClaseVueloRequest claseVueloRequest) {
        ClaseVuelo claseVuelo = new ClaseVuelo();
        claseVuelo.setNombre(claseVueloRequest.getNombre());
        return claseVueloRepository.save(claseVuelo);
    }
    
    public List<ClaseVuelo> getClaseVuelos(){
    	
    	return claseVueloRepository.findAll();
    }
}
