// src/app/models/usuario.model.ts
export interface Usuario {
    id: number;
    nombre_completo: string;
    pasaporte: number;
    fecha_nacimiento: string;
    nacionalidad: string;
    correo: string;
    codigo_pais: string;
    telefono: string;
    telefono_emerg: string;
    direccion: string;
    password: string;
    rolId: number;
  }
  