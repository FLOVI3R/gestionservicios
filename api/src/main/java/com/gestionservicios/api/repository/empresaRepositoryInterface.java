package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionservicios.api.models.empresa;

public interface empresaRepositoryInterface extends JpaRepository<empresa, Integer>{

}
