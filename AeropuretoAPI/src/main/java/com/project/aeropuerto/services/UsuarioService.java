package com.project.aeropuerto.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.repository.RolesRepository;
import com.project.aeropuerto.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolesRepository rolesRepository;

    public Usuario createUsuario(
    	String nombreCompleto, 
    	long pasaporte,
    	String fecha_nacimiento,
    	String nacionalidad,
     	String correo,
     	String codigo_pais,
     	String telefono,
   		String telefono_emerg,
    	String direccion,
    	String password,
    	Long rolId)
    	{
    	
        Roles rol = rolesRepository.findById(rolId)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        
        Usuario usuario = new Usuario();
        usuario.setNombre_completo(nombreCompleto);
        usuario.setPasaporte(pasaporte);
        usuario.setFecha_nacimiento(fecha_nacimiento);
        usuario.setNacionalidad(nacionalidad);
        usuario.setCorreo(correo);
        usuario.setCodigo_pais(codigo_pais);
        usuario.setTelefono(telefono);
        usuario.setTelefono_emerg(telefono_emerg);
        usuario.setDireccion(direccion);
        usuario.setPassword(password);
        usuario.setRoles(rol);
        
        return usuarioRepository.save(usuario);
    }
    
    public List<Usuario> getUsuarios(){
    		return usuarioRepository.findAll();
    }

    
    public Usuario updateUsuario(Long id, String nombreCompleto, Long rolId) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        
        Roles rol = rolesRepository.findById(rolId)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        
        usuario.setNombre_completo(nombreCompleto);
        usuario.setRoles(rol);
        
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}