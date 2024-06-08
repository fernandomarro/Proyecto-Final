package com.project.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {
}

