package com.projetospringboot.demo.repositories;

import com.projetospringboot.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
