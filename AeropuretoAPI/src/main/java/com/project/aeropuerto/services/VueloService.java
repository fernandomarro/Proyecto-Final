package com.project.aeropuerto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Aerolinea;
import com.project.aeropuerto.model.Aeropuerto;
import com.project.aeropuerto.model.ClaseVuelo;
import com.project.aeropuerto.model.Vuelo;
import com.project.aeropuerto.repository.AerolineaRepository;
import com.project.aeropuerto.repository.AeropuertoRepository;
import com.project.aeropuerto.repository.ClaseVueloRepository;
import com.project.aeropuerto.repository.VueloRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private AerolineaRepository aerolineaRepository;

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    @Autowired
    private ClaseVueloRepository claseVueloRepository;

    public Vuelo createVuelo(Long aerolineaId, Long aeropuertoSalidaId, Long aeropuertoLlegadaId, Long claseVueloId, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        Optional<Aerolinea> aerolinea = aerolineaRepository.findById(aerolineaId);
        Optional<Aeropuerto> aeropuertoSalida = aeropuertoRepository.findById(aeropuertoSalidaId);
        Optional<Aeropuerto> aeropuertoLlegada = aeropuertoRepository.findById(aeropuertoLlegadaId);
        Optional<ClaseVuelo> claseVuelo = claseVueloRepository.findById(claseVueloId);

        if (aerolinea.isPresent() && aeropuertoSalida.isPresent() && aeropuertoLlegada.isPresent() && claseVuelo.isPresent()) {
            Vuelo vuelo = new Vuelo();
            vuelo.setAerolinea(aerolinea.get());
            vuelo.setAeropuertoSalida(aeropuertoSalida.get());
            vuelo.setAeropuertoLlegada(aeropuertoLlegada.get());
            vuelo.setClaseVuelo(claseVuelo.get());
            vuelo.setHoraSalida(horaSalida);
            vuelo.setHoraLlegada(horaLlegada);

            return vueloRepository.save(vuelo);
        } else {
            throw new RuntimeException("No se encontró la entidad correspondiente para alguno de los IDs proporcionados");
        }
    }
    
    public List<Vuelo> getVuelos(){
    	
    	return vueloRepository.findAll();
    }
}
