package com.gestionservicios.api.DTO;

public class roleDTO {

	private Integer rolId;
	
	private String role;

	public roleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public roleDTO(Integer rolId, String role) {
		super();
		this.rolId = rolId;
		this.role = role;
	}

	public roleDTO(String role) {
		super();
		this.role = role;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
