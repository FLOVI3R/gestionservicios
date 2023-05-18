package com.gestionservicios.api.DTO;

public class comentarioDTO {

	private Integer idcomentarios;
	
	private Integer idAlumno;
	
	private Integer idServicio;
	
	private String comentario;

	public comentarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public comentarioDTO(Integer idcomentarios, Integer idAlumno, Integer idServicio, String comentario) {
		super();
		this.idcomentarios = idcomentarios;
		this.idAlumno = idAlumno;
		this.idServicio = idServicio;
		this.comentario = comentario;
	}

	public comentarioDTO(Integer idAlumno, Integer idServicio, String comentario) {
		super();
		this.idAlumno = idAlumno;
		this.idServicio = idServicio;
		this.comentario = comentario;
	}

	public Integer getIdcomentarios() {
		return idcomentarios;
	}

	public void setIdcomentarios(Integer idcomentarios) {
		this.idcomentarios = idcomentarios;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
