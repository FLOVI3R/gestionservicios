package com.gestionservicios.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "familiaprofesional")
public class familiaProfesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfamiliaprofesional;
	
	@Column(name = "nombre")
	private String nombre;

	public familiaProfesional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public familiaProfesional(Integer idfamiliaprofesional, String nombre) {
		super();
		this.idfamiliaprofesional = idfamiliaprofesional;
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
