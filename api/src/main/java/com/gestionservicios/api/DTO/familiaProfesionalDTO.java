package com.gestionservicios.api.DTO;

public class familiaProfesionalDTO {

	private Integer idfamiliaprofesional;
	
	private String nombre;

	public familiaProfesionalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public familiaProfesionalDTO(Integer idfamiliaprofesional, String nombre) {
		super();
		this.idfamiliaprofesional = idfamiliaprofesional;
		this.nombre = nombre;
	}

	public familiaProfesionalDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Integer getIdfamiliaprofesional() {
		return idfamiliaprofesional;
	}

	public void setIdfamiliaprofesional(Integer idfamiliaprofesional) {
		this.idfamiliaprofesional = idfamiliaprofesional;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
