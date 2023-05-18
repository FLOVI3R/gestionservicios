package com.gestionservicios.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestionservicios.api.DTO.empresaDTO;
import com.gestionservicios.api.models.empresa;
import com.gestionservicios.api.repository.empresaRepositoryInterface;

@Service
public class empresaServiceImpl implements empresaServiceInterface{

	@Autowired
	private empresaRepositoryInterface empresaRepo;
	
	public empresaServiceImpl(empresaRepositoryInterface empresaRepo) {
		super();
		this.empresaRepo = empresaRepo;
	}
	
	@Override
	public List<empresa> empresasList() {
		return empresaRepo.findAll();
	}

	@Override
	public empresa save(empresaDTO empresaDto) {
		empresa e = new empresa(empresaDto.getNombre(), empresaDto.getDireccion(), empresaDto.getEmail(), empresaDto.getTfno(), empresaDto.getLogo());
		return empresaRepo.save(e);
	}

	@Override
	public empresa getEmpresaById(Integer id) {
		return empresaRepo.getById(id);
	}

	@Override
	public void update(empresaDTO empresaDto) {
		empresa e = empresaRepo.getById(empresaDto.getIdEmpresa());
		e.setNombre(empresaDto.getNombre());
		e.setDireccion(empresaDto.getDireccion());
		e.setEmail(empresaDto.getEmail());
		e.setTfno(empresaDto.getTfno());
		e.setLogo(empresaDto.getLogo());
		empresaRepo.save(e);
	}

}
