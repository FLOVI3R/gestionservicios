package com.gestionservicios.api.service;

import java.util.List;

import com.gestionservicios.api.DTO.empresaDTO;
import com.gestionservicios.api.models.empresa;

public interface empresaServiceInterface {

	public List<empresa> empresasList();

	public empresa save(empresaDTO empresaDto);

	public empresa getEmpresaById(Integer id);

	public void update(empresaDTO empresaDto);
}
