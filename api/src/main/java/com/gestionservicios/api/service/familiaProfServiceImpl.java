package com.gestionservicios.api.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.gestionservicios.api.DTO.familiaProfesionalDTO;
import com.gestionservicios.api.models.familiaProfesional;
import com.gestionservicios.api.repository.familiaProfRepositoryInterface;

@Service
public class familiaProfServiceImpl implements familiaProfServiceInterface{

	private familiaProfRepositoryInterface familiaProfRepo;
	
	public familiaProfServiceImpl(familiaProfRepositoryInterface familiaProfRepo) {
		super();
		this.familiaProfRepo = familiaProfRepo;
	}
	
	@Override
	public List<familiaProfesional> familiasProfList() {
		return familiaProfRepo.findAll();
	}

	@Override
	public familiaProfesional save(familiaProfesionalDTO familiaProfesionalDto) {
		familiaProfesional f = new familiaProfesional(familiaProfesionalDto.getNombre());
		return familiaProfRepo.save(f);
	}

	@Override
	public familiaProfesional getFamiliaProfById(Integer id) {
		return familiaProfRepo.getById(id);
	}

	@Override
	public void update(familiaProfesionalDTO familiaProfDto) {
		familiaProfesional f = familiaProfRepo.getById(familiaProfDto.getIdfamiliaprofesional());
		f.setNombre(familiaProfDto.getNombre());
		familiaProfRepo.save(f);
	}
}
