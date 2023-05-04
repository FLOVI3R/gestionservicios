package com.gestionservicios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionservicios.api.models.comentario;

@Repository
public interface comentarioRepositoryInterface extends JpaRepository<comentario, Integer>{

}
