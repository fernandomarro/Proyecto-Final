package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}