import { Component, OnInit } from '@angular/core';
import { VueloService } from '../services/vuelo.service';
import { PasajeroService } from '../services/pasajero.service';
import { UsuarioService } from '../services/usuario.service';
import { Vuelo } from '../models/vuelo.model';
import { Usuario } from '../models/usuario.model';

@Component({
  selector: 'app-seleccionar-vuelo',
  templateUrl: './seleccionar-vuelo.component.html',
  styleUrls: ['./seleccionar-vuelo.component.css']
})
export class SeleccionarVueloComponent implements OnInit {
  vuelos: Vuelo[] = [];
  usuarios: Usuario[] = [];
  selectedVuelo: Vuelo | null = null;
  selectedUsuarioId: number | null = null;
  pasajero: any = { asiento: '', cantidadMaletas: 0 };

  constructor(
    private vueloService: VueloService,
    private pasajeroService: PasajeroService,
    private usuarioService: UsuarioService
  ) {}

  ngOnInit() {
    this.vueloService.getVuelos().subscribe(data => this.vuelos = data);
    this.usuarioService.getUsuarios().subscribe(data => this.usuarios = data);
  }

  seleccionarVuelo(vuelo: Vuelo) {
    this.selectedVuelo = vuelo;
  }

  onSubmit() {
    if (this.selectedVuelo && this.selectedUsuarioId !== null) {
      const pasajero = {
        usuarioId: this.selectedUsuarioId,
        vueloId: this.selectedVuelo.id,
        asiento: this.pasajero.asiento,
        cantidadMaletas: this.pasajero.cantidadMaletas
      };
      this.pasajeroService.crearPasajero(pasajero).subscribe(response => {
        console.log('Pasajero creado:', response);
        // Aquí puedes agregar una notificación de éxito o redirigir al usuario
        alert('SU ID DE VUELO ES :  '+response.id + '  GUARDELO PARA PASAR A ABORDAR!!')

        this.resetForm();
      });
    }
  }

  resetForm() {
    this.selectedVuelo = null;
    this.selectedUsuarioId = null;
    this.pasajero = { asiento: '', cantidadMaletas: 0 };
  }
}