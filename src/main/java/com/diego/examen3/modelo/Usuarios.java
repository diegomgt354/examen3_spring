package com.diego.examen3.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {

	@Id
	public int id;
	public String usuario;
	public String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
