package com.project.aeropuerto.modelRequest;

import java.util.List;

public class TripulacionRequest {
    private Long pilotoId;
    private Long copilotoId;
    private Long ingenieroVueloId;
    private List<Long> tripulantesCabinaIds;

    // Getters y Setters
    public Long getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(Long pilotoId) {
        this.pilotoId = pilotoId;
    }

    public Long getCopilotoId() {
        return copilotoId;
    }

    public void setCopilotoId(Long copilotoId) {
        this.copilotoId = copilotoId;
    }

    public Long getIngenieroVueloId() {
        return ingenieroVueloId;
    }

    public void setIngenieroVueloId(Long ingenieroVueloId) {
        this.ingenieroVueloId = ingenieroVueloId;
    }

    public List<Long> getTripulantesCabinaIds() {
        return tripulantesCabinaIds;
    }

    public void setTripulantesCabinaIds(List<Long> tripulantesCabinaIds) {
        this.tripulantesCabinaIds = tripulantesCabinaIds;
    }
}
