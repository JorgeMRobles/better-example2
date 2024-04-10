package com.jorge.example.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jorge.example.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
    
}
