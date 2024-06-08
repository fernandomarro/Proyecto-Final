package com.project.aeropuerto.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aerolinea_id", nullable = false)
    private Aerolinea aerolinea;

    @ManyToOne
    @JoinColumn(name = "aeropuerto_salida_id", nullable = false)
    private Aeropuerto aeropuertoSalida;

    @ManyToOne
    @JoinColumn(name = "aeropuerto_llegada_id", nullable = false)
    private Aeropuerto aeropuertoLlegada;

    @ManyToOne
    @JoinColumn(name = "clase_vuelo_id", nullable = false)
    private ClaseVuelo claseVuelo;

    @Column(nullable = false)
    private LocalDateTime horaSalida;

    @Column(nullable = false)
    private LocalDateTime horaLlegada;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    public ClaseVuelo getClaseVuelo() {
        return claseVuelo;
    }

    public void setClaseVuelo(ClaseVuelo claseVuelo) {
        this.claseVuelo = claseVuelo;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
}
