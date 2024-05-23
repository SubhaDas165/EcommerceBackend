package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Favourite;
import com.subhadas.app.domain.id.FavouriteId;

public interface FavouriteRepository extends JpaRepository<Favourite, FavouriteId> {
	
	
	
}
