import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearVueloComponent } from './crear-vuelo/crear-vuelo.component';
import { CrearUsuarioComponent } from './crear-usuario/crear-usuario.component';
import { SeleccionarVueloComponent } from './seleccionar-vuelo/seleccionar-vuelo.component';
import { BuscarPasajeroComponent } from './buscar-pasajero/buscar-pasajero.component';
const routes: Routes = [
  { path: 'crear-vuelo', component: CrearVueloComponent }, // Define la ruta para crear el vuelo
  {path : 'crear-usuario', component : CrearUsuarioComponent},
  {path : 'crear-pasajero', component : SeleccionarVueloComponent},
  {path : 'buscar-pasajero', component : BuscarPasajeroComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
