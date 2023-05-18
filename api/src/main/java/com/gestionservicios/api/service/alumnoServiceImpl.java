package com.gestionservicios.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.DTO.loginUserDTO;
import com.gestionservicios.api.models.alumno;
import com.gestionservicios.api.repository.alumnoRepositoryInterface;

@Service
public class alumnoServiceImpl implements alumnoServiceInterface {

	@Autowired
	private alumnoRepositoryInterface alumnoRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public alumnoServiceImpl(alumnoRepositoryInterface alumnoRepo) {
		super();
		this.alumnoRepo = alumnoRepo;
	}

	@Override
	public alumno save(alumnoDTO alumnoDto) {
		alumno a = new alumno(alumnoDto.getNombre(), alumnoDto.getApellidos(), alumnoDto.getEmail(), this.passwordEncoder.encode(alumnoDto.getPassword()), alumnoDto.getRole(), alumnoDto.getIdAlumnos());
		return alumnoRepo.save(a);
	}

	@Override
	public alumno loadAlumnoByEmail(String email) throws UsernameNotFoundException {
		alumno a = alumnoRepo.findAlumnoByEmail(email);
		if (email == null) {
			throw new UsernameNotFoundException("Usuario o contraseña incorrecta");
		}
		return new alumno(a.getNombre(), a.getApellidos(), a.getEmail(), a.getPassword(), a.getRole(), a.getIdfamilia());
	}

	@Override
	public List<alumno> alumnosList() {
		return alumnoRepo.findAll();
	}

	@Override
	public void deleteAlumnoById(Integer id) {
		alumnoRepo.deleteById(id);
	}

	@Override
	public alumno loginAccount(loginUserDTO loginUserDto) {
		alumno a = alumnoRepo.findAlumnoByEmail(loginUserDto.getEmail());
		if(a != null) {
			String pw = loginUserDto.getPassword();
			String encodedPw = a.getPassword();
			Boolean correctPw = passwordEncoder.matches(pw, encodedPw);
			if(correctPw) {
				return a;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
