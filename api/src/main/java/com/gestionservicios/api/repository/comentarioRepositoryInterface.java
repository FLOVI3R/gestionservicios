package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionservicios.api.models.comentario;

public interface comentarioRepositoryInterface extends JpaRepository<comentario, Integer>{

}
