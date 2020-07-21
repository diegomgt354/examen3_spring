package com.diego.examen3.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.diego.examen3.modelo.Categorias;

public interface ICategoriasService {

	public List<Categorias> listar();
	public Optional<Categorias> listarId(int Id);
	public int save(Categorias categoria);
	public void delete(int Id);
}
