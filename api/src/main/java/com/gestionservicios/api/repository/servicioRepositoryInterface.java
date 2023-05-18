package com.gestionservicios.api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.gestionservicios.api.models.servicio;

@Repository
public interface servicioRepositoryInterface extends JpaRepository<servicio, Integer>{

	@Query(value= "SELECT * FROM servicios WHERE titulo LIKE %?1%", nativeQuery=true)
	public List<servicio> findAll(String keyWord);
	
	public List<servicio> findAll();
	
	@Query(value= "SELECT * FROM servicios WHERE id_familia LIKE %?1%", nativeQuery=true)
	public List<servicio> findAllByFamiliaProf(Integer idFamilia);

	@Query(value= "SELECT * FROM servicios WHERE id_familia LIKE %?1% AND id_alumno NOT LIKE NULL", nativeQuery=true)
	public List<servicio> findAllByFamiliaProfAsignado(Integer idFamilia);
}
