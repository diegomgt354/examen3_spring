package com.diego.examen3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.examen3.modelo.Usuarios;

public interface IUsuarioRepo extends JpaRepository<Usuarios, Integer>{

	Usuarios findByUsuario(String usuario);
}
