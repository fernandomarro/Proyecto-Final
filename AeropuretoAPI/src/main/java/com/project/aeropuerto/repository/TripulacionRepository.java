package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Tripulacion;

public interface TripulacionRepository extends JpaRepository<Tripulacion, Long> {
}