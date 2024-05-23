package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
}
