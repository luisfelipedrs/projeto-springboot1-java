package com.projetospringboot.demo.services;

import com.projetospringboot.demo.entities.Category;
import com.projetospringboot.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findByID(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
