package com.gestionservicios.api.service;

import java.util.List;

import com.gestionservicios.api.DTO.comentarioDTO;
import com.gestionservicios.api.models.comentario;

public interface comentarioServiceInterface {

	public void comentarServicio(comentarioDTO comentarioDto);

	List<comentario> comentariosListByIdAlumno(Integer idAlumno);
}
