package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	
	
}
