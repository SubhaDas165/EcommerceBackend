package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.OrderItem;
import com.subhadas.app.domain.id.OrderItemId;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {
	
	
	
}
