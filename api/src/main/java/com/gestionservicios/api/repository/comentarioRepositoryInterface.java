package com.gestionservicios.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.gestionservicios.api.models.comentario;

@Repository
public interface comentarioRepositoryInterface extends JpaRepository<comentario, Integer>{

	@Query(value= "SELECT * FROM comentarios WHERE id_alumno LIKE %?1%", nativeQuery=true)
	List<comentario> findAllByidAlumno(Integer idAlumno);
}
