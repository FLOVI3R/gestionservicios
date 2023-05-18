package com.gestionservicios.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestionservicios.api.DTO.comentarioDTO;
import com.gestionservicios.api.models.alumno;
import com.gestionservicios.api.models.comentario;
import com.gestionservicios.api.repository.comentarioRepositoryInterface;

@Service
public class comentarioServiceImpl implements comentarioServiceInterface{

	@Autowired
	private comentarioRepositoryInterface comentarioRepo;
	
	@Override
	public void comentarServicio(comentarioDTO comentarioDto) {
		comentario c = new comentario(comentarioDto.getIdAlumno(), comentarioDto.getIdServicio(), comentarioDto.getComentario());
		comentarioRepo.save(c);
	}
	
	@Override
	public List<comentario> comentariosListByIdAlumno(Integer idAlumno) {
		return comentarioRepo.findAllByidAlumno(idAlumno);
	}
}
