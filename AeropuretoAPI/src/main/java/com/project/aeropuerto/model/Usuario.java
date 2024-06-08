package com.project.aeropuerto.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "usuario") // Especifica el nombre de la tabla en la base de datos
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre_completo;
    private long pasaporte;
    private String fecha_nacimiento;
    private String nacionalidad;
    private String correo;
    private String codigo_pais;
    private String telefono;
    private String telefono_emerg;
    private String direccion;
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false) // Especifica el nombre de la columna como "id_rol" en la tabla de usuario
    private Roles roles;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public long getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(long pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigo_pais() {
		return codigo_pais;
	}

	public void setCodigo_pais(String codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono_emerg() {
		return telefono_emerg;
	}

	public void setTelefono_emerg(String telefono_emerg) {
		this.telefono_emerg = telefono_emerg;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    
    
}