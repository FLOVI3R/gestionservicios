package com.gestionservicios.api.DTO;

import java.util.Date;

public class servicioDTO {

private Integer idservicios;
	
	private String titulo;
	
	private String descripcion;
	
	private Date fechaAlta;

	private Date fechaRealizacion;

	private Integer valoracion;
	
	private Integer idAlumno;
	
	private Integer idEmpresa;
	
	private Integer idFamilia;

	public servicioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public servicioDTO(String titulo, String descripcion, Date fechaAlta, Date fechaRealizacion, Integer valoracion, Integer idAlumno, Integer idEmpresa, Integer idFamilia) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.fechaRealizacion = fechaRealizacion;
		this.valoracion = valoracion;
		this.idAlumno = idAlumno;
		this.idEmpresa = idEmpresa;
		this.idFamilia = idFamilia;
	}

	public servicioDTO(Integer idservicios, String titulo, String descripcion, Date fechaAlta, Date fechaRealizacion, Integer valoracion, Integer idAlumno, Integer idEmpresa, Integer idFamilia) {
		super();
		this.idservicios = idservicios;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.fechaRealizacion = fechaRealizacion;
		this.valoracion = valoracion;
		this.idAlumno = idAlumno;
		this.idEmpresa = idEmpresa;
		this.idFamilia = idFamilia;
	}

	public Integer getIdservicios() {
		return idservicios;
	}

	public void setIdservicios(Integer idservicios) {
		this.idservicios = idservicios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(Integer idFamilia) {
		this.idFamilia = idFamilia;
	}
}
