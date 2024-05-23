package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
	
	
	
}
