package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Aerolinea;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Long> {
}
