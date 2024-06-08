package com.project.aeropuerto.modelRequest;

import java.time.LocalDateTime;

public class VueloRequest {

    private Long aerolineaId;
    private Long aeropuertoSalidaId;
    private Long aeropuertoLlegadaId;
    private Long claseVueloId;
    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;

    // Getters y Setters
    public Long getAerolineaId() {
        return aerolineaId;
    }

    public void setAerolineaId(Long aerolineaId) {
        this.aerolineaId = aerolineaId;
    }

    public Long getAeropuertoSalidaId() {
        return aeropuertoSalidaId;
    }

    public void setAeropuertoSalidaId(Long aeropuertoSalidaId) {
        this.aeropuertoSalidaId = aeropuertoSalidaId;
    }

    public Long getAeropuertoLlegadaId() {
        return aeropuertoLlegadaId;
    }

    public void setAeropuertoLlegadaId(Long aeropuertoLlegadaId) {
        this.aeropuertoLlegadaId = aeropuertoLlegadaId;
    }

    public Long getClaseVueloId() {
        return claseVueloId;
    }

    public void setClaseVueloId(Long claseVueloId) {
        this.claseVueloId = claseVueloId;
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
