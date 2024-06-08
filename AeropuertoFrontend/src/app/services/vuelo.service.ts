import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VueloService {
  private apiUrl = 'http://localhost:8080/vuelos';

  constructor(private http: HttpClient) {}

  crearVuelo(vuelo: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/crear`, vuelo);
  }

  getVuelos(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/getVuelos`);
  }
}



