package com.gestionservicios.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.familiaProfesional;

@Repository
public interface familiaProfRepositoryInterface extends JpaRepository<familiaProfesional, Integer>{
	public List<familiaProfesional> findAll();
}
