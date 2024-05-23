package com.subhadas.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Credential;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {
	
	Optional<Credential> findByUsername(final String username);
	
}
