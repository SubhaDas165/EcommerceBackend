package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
	
}
