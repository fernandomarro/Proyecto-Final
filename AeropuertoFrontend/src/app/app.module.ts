import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Importa FormsModule
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CrearVueloComponent } from './crear-vuelo/crear-vuelo.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CrearUsuarioComponent } from './crear-usuario/crear-usuario.component';
import { SeleccionarVueloComponent } from './seleccionar-vuelo/seleccionar-vuelo.component';
import { BuscarPasajeroComponent } from './buscar-pasajero/buscar-pasajero.component';


@NgModule({
  declarations: [
    AppComponent,
    CrearVueloComponent,
    CrearUsuarioComponent,
    SeleccionarVueloComponent,
    BuscarPasajeroComponent
  ],
  imports: [
    BrowserModule,
    FormsModule, // Agrega FormsModule aquí
    AppRoutingModule, BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
