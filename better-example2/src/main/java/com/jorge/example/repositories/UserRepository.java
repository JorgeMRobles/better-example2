package com.jorge.example.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jorge.example.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
