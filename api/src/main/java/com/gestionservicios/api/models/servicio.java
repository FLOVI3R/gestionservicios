package com.gestionservicios.api.models;

import java.util.Date;

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
@Table(name="servicios")
public class servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idservicios;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaAlta")
	private Date fechaAlta;
	
	@Column(name = "fechaRealizacion")
	private Date fechaRealizacion;
	
	@Column(name = "valoracion")
	private Integer valoracion;

	public servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public servicio(Integer idservicios, String titulo, String descripcion, Date fechaAlta, Date fechaRealizacion,
			Integer valoracion) {
		super();
		this.idservicios = idservicios;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.fechaRealizacion = fechaRealizacion;
		this.valoracion = valoracion;
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
}

