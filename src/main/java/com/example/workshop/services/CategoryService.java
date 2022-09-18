package com.example.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.entities.Category;
import com.example.workshop.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> userOptinal = categoryRepository.findById(id);
		
		return userOptinal.get();
	}
}
