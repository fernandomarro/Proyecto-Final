// src/app/buscar-pasajero/buscar-pasajero.component.ts
import { Component } from '@angular/core';
import { PasajeroService } from '../services/pasajero.service';

@Component({
  selector: 'app-buscar-pasajero',
  templateUrl: './buscar-pasajero.component.html',
  styleUrls: ['./buscar-pasajero.component.css']
})
export class BuscarPasajeroComponent {
  pasajeroId: number | null = null;
  mensaje: string | null = null;

  constructor(private pasajeroService: PasajeroService) {}

  buscarPasajero() {
    if (this.pasajeroId !== null) {
      this.pasajeroService.getPasajeroById(this.pasajeroId).subscribe(
        response => {
          if (response) {
            this.mensaje = "Pasajero abordado";
            
            console.log(response)
            alert('Usuario Abordado')
          } else {
            this.mensaje = "Pasajero no encontrado";
          }
        },
        error => {
          this.mensaje = "Pasajero no encontrado";
        }
      );
    }
  }
}
