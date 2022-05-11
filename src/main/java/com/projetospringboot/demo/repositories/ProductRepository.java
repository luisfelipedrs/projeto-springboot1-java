package com.projetospringboot.demo.repositories;

import com.projetospringboot.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
