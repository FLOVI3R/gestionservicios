package com.gestionservicios.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.models.alumno;
import com.gestionservicios.api.repository.alumnoRepositoryInterface;

@Service
public class alumnoServiceImpl implements alumnoServiceInterface {

	private alumnoRepositoryInterface alumnoRepo;

	@Autowired
	private BCryptPasswordEncoder pwEncoder;

	public alumnoServiceImpl(alumnoRepositoryInterface alumnoRepo) {
		super();
		this.alumnoRepo = alumnoRepo;
	}

	@Override
	public alumno save(alumnoDTO alumnoDto) {
		alumno a = new alumno(alumnoDto.getNombre(), alumnoDto.getApellidos(), alumnoDto.getEmail(),
				pwEncoder.encode(alumnoDto.getPassword()), alumnoDto.getRole());
		return alumnoRepo.save(a);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		alumno a = alumnoRepo.findAlumnoByEmail(username);
		if (username == null) {
			throw new UsernameNotFoundException("Usuario o contraseña incorrecta");
		}
		return new User(a.getEmail(), a.getPassword(), null);
	}

	@Override
	public List<alumno> alumnosList() {
		return alumnoRepo.findAll();
	}
}
