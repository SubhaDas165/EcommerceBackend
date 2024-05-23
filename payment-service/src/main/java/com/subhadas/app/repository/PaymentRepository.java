package com.subhadas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadas.app.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	
	
}
