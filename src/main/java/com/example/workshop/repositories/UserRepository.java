package com.example.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
