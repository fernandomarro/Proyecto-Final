package com.project.aeropuerto.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "aerolinea")
public class Aerolinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "aerolinea", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Aeronave> aeronaves;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }
}
