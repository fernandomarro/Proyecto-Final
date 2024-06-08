import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClaseVueloService {
  private apiUrl = 'http://localhost:8080/clases-vuelo';

  constructor(private http: HttpClient) {}

  getClasesVuelo(): Observable<any> {
    return this.http.get(`${this.apiUrl}/getClases`);
  }
}
