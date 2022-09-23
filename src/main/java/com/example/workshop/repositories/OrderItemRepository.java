package com.example.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
