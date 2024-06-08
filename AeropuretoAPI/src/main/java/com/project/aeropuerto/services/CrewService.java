package com.project.aeropuerto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.model.Tripulacion;
import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.repository.RolesRepository;
import com.project.aeropuerto.repository.TripulacionRepository;
import com.project.aeropuerto.repository.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CrewService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private TripulacionRepository tripulacionRepository;

    public List<Usuario> getUsuariosPorRol(Long rolId) {
        Roles rol = rolesRepository.findById(rolId)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        return usuarioRepository.findByRoles(rol);
    }

    public Tripulacion createTripulacion(Long pilotoId, Long copilotoId, Long ingenieroVueloId, List<Long> tripulantesCabinaIds) {
        Usuario piloto = usuarioRepository.findById(pilotoId)
                .orElseThrow(() -> new RuntimeException("Piloto no encontrado"));
        Usuario copiloto = usuarioRepository.findById(copilotoId)
                .orElseThrow(() -> new RuntimeException("Copiloto no encontrado"));
        Usuario ingenieroVuelo = usuarioRepository.findById(ingenieroVueloId)
                .orElseThrow(() -> new RuntimeException("Ingeniero de vuelo no encontrado"));

        List<Usuario> tripulantesCabina = tripulantesCabinaIds.stream()
                .map(id -> usuarioRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Tripulante de cabina no encontrado: " + id)))
                .collect(Collectors.toList());

        Tripulacion tripulacion = new Tripulacion();
        tripulacion.setPiloto(piloto);
        tripulacion.setCopiloto(copiloto);
        tripulacion.setIngenieroVuelo(ingenieroVuelo);
        tripulacion.setTripulantesCabina(tripulantesCabina);

        return tripulacionRepository.save(tripulacion);
    }
    
    public List<Tripulacion> getTripulaciones(){
    	return tripulacionRepository.findAll();
    }
}
