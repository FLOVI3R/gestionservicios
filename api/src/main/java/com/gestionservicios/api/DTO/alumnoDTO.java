package com.gestionservicios.api.DTO;

public class alumnoDTO {

	private Integer idAlumnos;
	
	private String nombre;
	
	private String apellidos;

	private String email;

	private String password;
	
	private String role;

	public alumnoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public alumnoDTO(Integer idAlumnos, String nombre, String apellidos, String email, String password, String role) {
		super();
		this.idAlumnos = idAlumnos;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public alumnoDTO(String nombre, String apellidos, String email, String password, String role) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.role = role;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
