package com.gestionservicios.api.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
public class alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumnos;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name="role")
    private Set<role> role;
	
	@Column(name="idfamilia")
	private Integer idfamilia;
	
	public alumno(String nombre, String apellidos, String email, String password,
			Set<com.gestionservicios.api.models.role> role, Integer idfamilia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.role = role;
		this.idfamilia = idfamilia;
	}

	public alumno(Integer idAlumnos, String nombre, String apellidos, String email, String password,
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

	public alumno() {
		super();
		// TODO Auto-generated constructor stub
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