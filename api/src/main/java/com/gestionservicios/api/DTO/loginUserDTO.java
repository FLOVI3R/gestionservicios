package com.gestionservicios.api.DTO;

public class loginUserDTO {

	private String email;
	
	private String password;

	public loginUserDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public loginUserDTO() {
		super();
		// TODO Auto-generated constructor stub
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
}
