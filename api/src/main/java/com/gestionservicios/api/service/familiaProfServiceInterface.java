package com.gestionservicios.api.service;

import java.util.List;

import com.gestionservicios.api.DTO.familiaProfesionalDTO;
import com.gestionservicios.api.models.familiaProfesional;

public interface familiaProfServiceInterface {

	public List<familiaProfesional> familiasProfList();

	public familiaProfesional save(familiaProfesionalDTO familiaProfesionalDto);

	public familiaProfesional getFamiliaProfById(Integer id);

	public void update(familiaProfesionalDTO familiaProfDto);
}
