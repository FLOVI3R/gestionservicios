package com.gestionservicios.api.service;

import java.util.List;
import java.util.Optional;

import com.gestionservicios.api.DTO.servicioDTO;
import com.gestionservicios.api.models.servicio;

public interface servicioServiceInterface {
	
	List<servicio> serviciosList(String keyWord);

	servicio save(servicioDTO servicioDto);

	servicio getServicioById(Integer id);

	void updateServicio(servicioDTO servicioDto);

	void deleteServicio(Integer id);

	List<servicio> serviciosListByFamiliaProf(Integer idFamilia);

	List<servicio> serviciosListByFamiliaProfAsignados(Integer idFamilia);
}
