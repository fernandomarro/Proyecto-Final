import { Component, OnInit } from '@angular/core';
import { VueloService } from '../services/vuelo.service';
import { AerolineaService } from '../services/aerolinea.service';
import { AeropuertoService } from '../services/aeropuerto.service';
import { ClaseVueloService } from '../services/clase-vuelo.service';

@Component({
  selector: 'app-crear-vuelo',
  templateUrl: './crear-vuelo.component.html',
  styleUrls: ['./crear-vuelo.component.css']
})
export class CrearVueloComponent implements OnInit {
  vuelo: any = {};
  aerolineas: any[] = [];
  aeropuertos: any[] = [];
  clasesVuelo: any[] = [];

  constructor(
    private vueloService: VueloService,
    private aerolineaService: AerolineaService,
    private aeropuertoService: AeropuertoService,
    private claseVueloService: ClaseVueloService
  ) {}

  ngOnInit() {
    this.aerolineaService.getAerolineas().subscribe(data => this.aerolineas = data);
    this.aeropuertoService.getAeropuertos().subscribe(data => this.aeropuertos = data);
    this.claseVueloService.getClasesVuelo().subscribe(data => this.clasesVuelo = data);
  }

  onSubmit() {
    this.vueloService.crearVuelo(this.vuelo).subscribe(response => {
      
      console.log('Vuelo creado', response);
      this.vuelo = {}
      alert('Vuelo creado exitosamente')
      // Aquí puedes agregar una notificación de éxito o redirigir al usuario
    });
  }
}
