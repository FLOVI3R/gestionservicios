package com.gestionservicios.api.DTO;

public class empresaDTO {
	
	private Integer idEmpresa;
	
	private String nombre;
	
	private String direccion;
	
	private String tfno;
	
	private String email;
	
	private String logo;

	public empresaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empresaDTO(Integer idEmpresa, String nombre, String direccion, String tfno, String email, String logo) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tfno = tfno;
		this.email = email;
		this.logo = logo;
	}

	public empresaDTO(String nombre, String direccion, String tfno, String email, String logo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.tfno = tfno;
		this.email = email;
		this.logo = logo;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
}
