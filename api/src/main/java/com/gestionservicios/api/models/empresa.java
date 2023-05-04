package com.gestionservicios.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="empresas")
public class empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpresas;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "tfno")
	private String tfno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "logo")
	private String logo;

	public empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empresa(Integer idEmpresas, String nombre, String direccion, String tfno, String email, String logo) {
		super();
		this.idEmpresas = idEmpresas;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tfno = tfno;
		this.email = email;
		this.logo = logo;
	}

	public Integer getIdEmpresas() {
		return idEmpresas;
	}

	public void setIdEmpresas(Integer idEmpresas) {
		this.idEmpresas = idEmpresas;
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

