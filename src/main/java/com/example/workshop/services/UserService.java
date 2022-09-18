package com.example.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.entities.User;
import com.example.workshop.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository orderRepository;
	
	public List<User> findAll(){
		return orderRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> userOptinal = orderRepository.findById(id);
		
		return userOptinal.get();
	}
}
