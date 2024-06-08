package com.project.aeropuerto.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tripulacion")
public class Tripulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "piloto_id", nullable = false)
    private Usuario piloto;

    @ManyToOne
    @JoinColumn(name = "copiloto_id", nullable = false)
    private Usuario copiloto;

    @ManyToOne
    @JoinColumn(name = "ingeniero_vuelo_id", nullable = false)
    private Usuario ingenieroVuelo;

    @ManyToMany
    @JoinTable(
        name = "tripulacion_tripulantes_cabina",
        joinColumns = @JoinColumn(name = "tripulacion_id"),
        inverseJoinColumns = @JoinColumn(name = "tripulante_cabina_id")
    )
    private List<Usuario> tripulantesCabina;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getPiloto() {
        return piloto;
    }

    public void setPiloto(Usuario piloto) {
        this.piloto = piloto;
    }

    public Usuario getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Usuario copiloto) {
        this.copiloto = copiloto;
    }

    public Usuario getIngenieroVuelo() {
        return ingenieroVuelo;
    }

    public void setIngenieroVuelo(Usuario ingenieroVuelo) {
        this.ingenieroVuelo = ingenieroVuelo;
    }

    public List<Usuario> getTripulantesCabina() {
        return tripulantesCabina;
    }

    public void setTripulantesCabina(List<Usuario> tripulantesCabina) {
        this.tripulantesCabina = tripulantesCabina;
    }
}
