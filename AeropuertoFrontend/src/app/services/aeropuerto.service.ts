import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AeropuertoService {
  private apiUrl = 'http://localhost:8080/aeropuertos';

  constructor(private http: HttpClient) {}

  getAeropuertos(): Observable<any> {
    return this.http.get(`${this.apiUrl}/getAeropuertos`);
  }
}
