package com.diego.examen3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.diego.examen3.modelo.Usuarios;
import com.diego.examen3.repo.IUsuarioRepo;


@SpringBootTest
class Examen3ApplicationTests {
	
	@Autowired
	private IUsuarioRepo repositorio;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void creacionDeUsuario() {
		Usuarios user = new Usuarios();
		user.setId(1);
		user.setUsuario("docente");
		user.setPassword(encoder.encode("d18135"));
		Usuarios retorno = repositorio.save(user);
		
		retorno.getPassword().equalsIgnoreCase(user.getUsuario());
		
	}

}
