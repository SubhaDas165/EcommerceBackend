package com.subhadas.app.service;

import java.util.List;

import com.subhadas.app.domain.id.FavouriteId;
import com.subhadas.app.dto.FavouriteDto;

public interface FavouriteService {
	
	List<FavouriteDto> findAll();
	FavouriteDto findById(final FavouriteId favouriteId);
	FavouriteDto save(final FavouriteDto favouriteDto);
	FavouriteDto update(final FavouriteDto favouriteDto);
	void deleteById(final FavouriteId favouriteId);
	
}
