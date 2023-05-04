package com.gestionservicios.api.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.models.alumno;

public interface alumnoServiceInterface extends UserDetailsService {

	public alumno save(alumnoDTO alumnoDto);

	List<alumno> alumnosList();
	
	public void deleteAlumnoById(Integer id);
}
