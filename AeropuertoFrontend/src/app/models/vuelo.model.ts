// src/app/models/vuelo.model.ts
export interface Vuelo {
    id: number;
    aerolinea: {
      id: number;
      nombre: string;
    };
    aeropuertoSalida: {
      id: number;
      nombre: string;
      ciudad: string;
      pais: string;
    };
    aeropuertoLlegada: {
      id: number;
      nombre: string;
      ciudad: string;
      pais: string;
    };
    claseVuelo: {
      id: number;
      nombre: string;
    };
    horaSalida: string;
    horaLlegada: string;
  }
  