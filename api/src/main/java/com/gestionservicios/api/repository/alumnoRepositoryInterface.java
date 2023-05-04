package com.gestionservicios.api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.alumno;

@Repository
public interface alumnoRepositoryInterface extends JpaRepository<alumno, Integer> {

	public alumno findAlumnoByEmail(String email);

	public List<alumno> findAll();
}