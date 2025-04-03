package com.example.safety.dto;

import com.example.safety.entities.Usuario;

public class UsuarioDTO {

	private long id;
	private String email;
	private String senha;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}

	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		email = entity.getEmail();
		senha = entity.getSenha();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
