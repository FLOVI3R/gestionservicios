package com.gestionservicios.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionservicios.api.DTO.empresaDTO;
import com.gestionservicios.api.DTO.servicioDTO;
import com.gestionservicios.api.models.empresa;
import com.gestionservicios.api.models.servicio;
import com.gestionservicios.api.repository.servicioRepositoryInterface;

@Service
public class servicioServiceImpl implements servicioServiceInterface{

	@Autowired
	private servicioRepositoryInterface servicioRepo;
	
	@Override
	public List<servicio> serviciosList(String keyWord) {
		if(keyWord != null) {
			return servicioRepo.findAll(keyWord);
		}
		
		return servicioRepo.findAll();
	}
	
	@Override
	public List<servicio> serviciosListByFamiliaProf(Integer idFamilia) {
		return servicioRepo.findAllByFamiliaProf(idFamilia);
	}
	
	@Override
	public List<servicio> serviciosListByFamiliaProfAsignados(Integer idFamilia) {
		return servicioRepo.findAllByFamiliaProfAsignado(idFamilia);
	}
	
	@Override
	public servicio save(servicioDTO servicioDto) {
		servicio s = new servicio(servicioDto.getTitulo(), servicioDto.getDescripcion(), servicioDto.getFechaAlta(), servicioDto.getFechaRealizacion(), servicioDto.getValoracion(), servicioDto.getIdAlumno(), servicioDto.getIdEmpresa(), servicioDto.getIdFamilia());
		return servicioRepo.save(s);
	}

	@Override
	public servicio getServicioById(Integer id) {
		return servicioRepo.getById(id);
	}
	
	@Override
	public void deleteServicio(Integer id) {
		servicioRepo.deleteById(id);
	}
	
	@Override
	public void updateServicio(servicioDTO servicioDto) {
		//Optional<servicio> s = servicioRepo.getById(servicioDto.getIdservicios());
		servicio updatedServicio = servicioRepo.getById(servicioDto.getIdservicios());
		updatedServicio.setTitulo(servicioDto.getTitulo());
		updatedServicio.setDescripcion(servicioDto.getDescripcion());
		updatedServicio.setFechaAlta(servicioDto.getFechaAlta());
		updatedServicio.setFechaRealizacion(servicioDto.getFechaRealizacion());
		updatedServicio.setValoracion(servicioDto.getValoracion());
		servicioRepo.save(updatedServicio);
	}
}
