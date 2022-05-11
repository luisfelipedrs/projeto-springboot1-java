package com.projetospringboot.demo.services;

import com.projetospringboot.demo.entities.Order;
import com.projetospringboot.demo.entities.User;
import com.projetospringboot.demo.repositories.OrderRepository;
import com.projetospringboot.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findByID(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
