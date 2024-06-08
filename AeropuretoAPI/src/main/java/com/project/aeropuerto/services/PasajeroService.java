package com.project.aeropuerto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Pasajero;
import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.model.Vuelo;
import com.project.aeropuerto.repository.PasajeroRepository;
import com.project.aeropuerto.repository.UsuarioRepository;
import com.project.aeropuerto.repository.VueloRepository;

@Service
public class PasajeroService {

    @Autowired
    private PasajeroRepository pasajeroRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private VueloRepository vueloRepository;
    

    public Pasajero createPasajero(long usuariId, long vueloId, String asiento, int maletas) {
    	Usuario pasajero = usuarioRepository.findById(usuariId)
                .orElseThrow(() -> new RuntimeException("Pasajero no encontrado"));
    	Vuelo vuelo = vueloRepository.findById(vueloId)
    			.orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));
    	
    	Pasajero pasaj = new Pasajero();
    	pasaj.setUsuario(pasajero);
    	pasaj.setVuelo(vuelo);
    	pasaj.setAsiento(asiento);
    	pasaj.setCantidadMaletas(maletas);
        return pasajeroRepository.save(pasaj);
    }

    public List<Pasajero> getPasajeros(){
    	return pasajeroRepository.findAll();
    }
    
    public Optional<Pasajero> getPasajero(long id){
    	
    	return pasajeroRepository.findById(id);
    }
     
    
}
