package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Aeronave;

public interface AeronaveRepository extends JpaRepository<Aeronave, Long> {
}
