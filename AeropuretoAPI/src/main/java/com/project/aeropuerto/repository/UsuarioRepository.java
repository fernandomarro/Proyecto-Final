package com.project.aeropuerto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	List<Usuario> findByRoles(Roles rol);
	Usuario findByCorreo(String correo);
}
