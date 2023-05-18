package com.gestionservicios.api.DTO;

import java.util.Set;

import com.gestionservicios.api.models.role;

public class alumnoDTO {

	private Integer idAlumnos;
	
	private String nombre;
	
	private String apellidos;

	private String email;

	private String password;
	
	private Set<role> role;
	
	private Integer idfamilia;

	public alumnoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public alumnoDTO(String nombre, String apellidos, String email, String password,
			Set<com.gestionservicios.api.models.role> role, Integer idfamilia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.role = role;
		this.idfamilia = idfamilia;
	}



	public alumnoDTO(Integer idAlumnos, String nombre, String apellidos, String email, String password,
			Set<com.gestionservicios.api.models.role> role, Integer idfamilia) {
		super();
		this.idAlumnos = idAlumnos;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.role = role;
		this.idfamilia = idfamilia;
	}



	public alumnoDTO(String email) {
		super();
		this.email = email;
	}

	public Integer getIdAlumnos() {
		return idAlumnos;
	}

	public void setIdAlumnos(Integer idAlumnos) {
		this.idAlumnos = idAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<role> getRole() {
		return role;
	}

	public void setRole(Set<role> role) {
		this.role = role;
	}

	public int getIdfamilia() {
		return idfamilia;
	}

	public void setIdfamilia(Integer idfamilia) {
		this.idfamilia = idfamilia;
	}
}
