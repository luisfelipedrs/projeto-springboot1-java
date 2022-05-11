package com.projetospringboot.demo.repositories;

import com.projetospringboot.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
