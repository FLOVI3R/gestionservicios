package com.gestionservicios.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.empresa;

@Repository
public interface empresaRepositoryInterface extends JpaRepository<empresa, Integer>{
	public List<empresa> findAll();
}
