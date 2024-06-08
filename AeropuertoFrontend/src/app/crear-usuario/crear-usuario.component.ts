import { Component, OnInit } from '@angular/core';
import { UsuarioService } from '../services/usuario.service';
import { RolesService } from '../services/rol-usuario.service';

@Component({
  selector: 'app-crear-usuario',
  templateUrl: './crear-usuario.component.html',
  styleUrls: ['./crear-usuario.component.css']
})

export class CrearUsuarioComponent implements OnInit {
  usuario: any = {}; // Objeto para almacenar la información del usuario
  roles : any[] = [];

  constructor(
    private rolesService: RolesService,
    private usuarioService: UsuarioService) {}

    
  ngOnInit() {
    this.rolesService.obtenerRoles().subscribe(data => this.roles = data);
  }
 
  onSubmit() {
    this.usuarioService.crearUsuario(this.usuario).subscribe(response => {
      console.log('Usuario creado', response);
      this.limpiarFormulario(); 
      alert('Usuario creado correctamente');
    });
  }

  limpiarFormulario() {
    this.usuario = {}; // Reiniciar el objeto usuario
  }
}
