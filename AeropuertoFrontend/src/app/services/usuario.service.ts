import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private baseUrl = 'http://localhost:8080'; // URL base de tu backend

  constructor(private http: HttpClient) {}

  crearUsuario(usuario: any) {
    return this.http.post<any>(`${this.baseUrl}/usuarios`, usuario);
  }

  getUsuarios(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/usuarios`);
  }

  // Mas metodos
}

