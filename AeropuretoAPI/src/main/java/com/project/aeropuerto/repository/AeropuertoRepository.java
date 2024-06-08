package com.project.aeropuerto.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Aeropuerto;

public interface AeropuertoRepository extends JpaRepository<Aeropuerto, Long> {
}
