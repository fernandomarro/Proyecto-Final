import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RolesService {
  private baseUrl = 'http://localhost:8080'; // URL base de tu backend

  constructor(private http: HttpClient) {}

  obtenerRoles() {
    return this.http.get<any[]>(`${this.baseUrl}/roles`);
  }
}