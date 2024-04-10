package com.jorge.example.services;

import java.util.List;

import com.jorge.example.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
