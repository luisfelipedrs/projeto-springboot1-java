package com.projetospringboot.demo.repositories;

import com.projetospringboot.demo.entities.Category;
import com.projetospringboot.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
