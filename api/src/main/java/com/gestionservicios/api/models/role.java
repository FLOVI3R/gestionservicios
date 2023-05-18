package com.gestionservicios.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rolId;
	
	@Column
	private String role;

	public role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public role(Integer rolId, String role) {
		super();
		this.rolId = rolId;
		this.role = role;
	}

	public role(String role) {
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
