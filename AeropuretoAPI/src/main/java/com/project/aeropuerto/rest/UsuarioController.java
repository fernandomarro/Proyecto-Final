package com.project.aeropuerto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.aeropuerto.model.Usuario;
import com.project.aeropuerto.modelRequest.LoginRequest;
import com.project.aeropuerto.modelRequest.UsuarioRequest;
import com.project.aeropuerto.modelResponse.LoginResponse;
import com.project.aeropuerto.repository.UsuarioRepository;
import com.project.aeropuerto.services.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario createUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.createUsuario(
        		usuarioRequest.getNombre_completo(), 
        		usuarioRequest.getPasaporte(),
        		usuarioRequest.getFecha_nacimiento(),
        		usuarioRequest.getNacionalidad(),
        		usuarioRequest.getCorreo(),
        		usuarioRequest.getCodigo_pais(),
        		usuarioRequest.getTelefono(),
        		usuarioRequest.getTelefono_emerg(),
        		usuarioRequest.getDireccion(),
        		usuarioRequest.getPassword(),
        		usuarioRequest.getRolId());
    }

    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }
    
    /*
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.updateUsuario(id, usuarioRequest.getNombre(), usuarioRequest.getRolId());
    }*/
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Usuario usuario = usuarioRepository.findByCorreo(loginRequest.getCorreo());

        if (usuario == null || !usuario.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }

        // Return the role of the user
        return ResponseEntity.ok(usuario.getRoles().getNombre());
    }
    
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
    }
}
