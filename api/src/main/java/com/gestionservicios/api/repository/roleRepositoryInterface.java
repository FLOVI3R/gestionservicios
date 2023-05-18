package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.role;

@Repository
public interface roleRepositoryInterface extends JpaRepository<role, Integer>{

	role findByRole(String role);
}
