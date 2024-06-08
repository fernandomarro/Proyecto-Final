package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Pasajero;

public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {
}
