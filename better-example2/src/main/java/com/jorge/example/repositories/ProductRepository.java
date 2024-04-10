package com.jorge.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jorge.example.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
