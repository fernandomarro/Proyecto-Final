import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pasajero } from '../models/pasajero.model';
@Injectable({
  providedIn: 'root'
})
export class PasajeroService {
  private apiUrl = 'http://localhost:8080/pasajeros';

  constructor(private http: HttpClient) { }

  crearPasajero(pasajero: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/crear`, pasajero);
  }

  getPasajeroById(id: number): Observable<Pasajero> {
    return this.http.get<Pasajero>(`${this.apiUrl}/getPasajero/${id}`);
  }
}
