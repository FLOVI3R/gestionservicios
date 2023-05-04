package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.servicio;

@Repository
public interface servicioRepositoryInterface extends JpaRepository<servicio, Integer>{

}
