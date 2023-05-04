package com.gestionservicios.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcomentarios;
	
	@Column(name = "idAlumno")
	private Integer idAlumno;
	
	@Column(name = "idServicio")
	private Integer idServicio;
	
	@Column(name = "comentario")
	private String comentario;

	public comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public comentario(Integer idcomentarios, int idAlumno, int idServicio, String comentario) {
		super();
		this.idcomentarios = idcomentarios;
		this.idAlumno = idAlumno;
		this.idServicio = idServicio;
		this.comentario = comentario;
	}

	public Integer getIdcomentarios() {
		return idcomentarios;
	}

	public void setIdcomentarios(Integer idcomentarios) {
		this.idcomentarios = idcomentarios;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
