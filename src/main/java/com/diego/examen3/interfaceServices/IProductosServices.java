package com.diego.examen3.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.diego.examen3.modelo.Productos;

public interface IProductosServices {

	public List<Productos> listar();
	public Optional<Productos> listarId(int Id);
	public int save(Productos productos);
	public void delete(int Id);
}
