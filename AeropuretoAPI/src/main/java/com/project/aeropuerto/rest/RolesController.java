package com.project.aeropuerto.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.aeropuerto.model.Roles;
import com.project.aeropuerto.services.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @PostMapping
    public Roles createRole(@RequestBody Roles role) {
        return rolesService.createRole(role);
    }

    @GetMapping("/{id}")
    public Optional<Roles> getRoleById(@PathVariable Long id) {
        return rolesService.getRoleById(id);
    }

    @GetMapping
    public List<Roles> getAllRoles() {
        return rolesService.getAllRoles();
    }

    @PutMapping("/{id}")
    public Roles updateRole(@PathVariable Long id, @RequestBody Roles roleDetails) {
        return rolesService.updateRole(id, roleDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        rolesService.deleteRole(id);
    }
}