package com.project.aeropuerto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.repository.RolesRepository;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public Roles createRole(Roles role) {
        return rolesRepository.save(role);
    }

    public Optional<Roles> getRoleById(Long id) {
        return rolesRepository.findById(id);
    }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Roles updateRole(Long id, Roles roleDetails) {
        Roles role = rolesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));
        role.setNombre(roleDetails.getNombre());
        return rolesRepository.save(role);
    }

    public void deleteRole(Long id) {
        rolesRepository.deleteById(id);
    }
}