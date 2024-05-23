package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	
	
}
