package com.example.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
