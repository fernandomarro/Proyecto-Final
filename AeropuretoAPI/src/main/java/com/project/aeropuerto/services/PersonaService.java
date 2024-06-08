package com.project.aeropuerto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Persona;
import com.project.aeropuerto.repository.PersonaRepository;



@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaResporitory;
	
	
	public Persona create (Persona persona) {
		return personaResporitory.save(persona);
	}
	
	public List<Persona> getAllPersonas (){
		return personaResporitory.findAll();
	}
	
	public void delete (Persona persona) {
		personaResporitory.delete(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaResporitory.findById(id);
	}
	

}