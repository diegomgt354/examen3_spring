package com.diego.examen3.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.examen3.modelo.Categorias;

@Repository
public interface ICategorias extends CrudRepository<Categorias, Integer>{

}
