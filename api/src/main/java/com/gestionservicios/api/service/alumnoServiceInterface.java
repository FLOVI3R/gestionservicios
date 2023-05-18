package com.gestionservicios.api.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.DTO.loginUserDTO;
import com.gestionservicios.api.models.alumno;

public interface alumnoServiceInterface extends UserDetailsService {

	public alumno save(alumnoDTO alumnoDto);

	public List<alumno> alumnosList();
	
	public void deleteAlumnoById(Integer id);

	public alumno loginAccount(loginUserDTO loginUserDto);

	public alumno loadAlumnoByEmail(String email) throws UsernameNotFoundException;
}
