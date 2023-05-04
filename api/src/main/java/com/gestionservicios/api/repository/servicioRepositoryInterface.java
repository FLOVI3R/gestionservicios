package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionservicios.api.models.servicio;

public interface servicioRepositoryInterface extends JpaRepository<servicio, Integer>{

}
