package com.diego.examen3.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.diego.examen3.modelo.Proveedores;

public interface IProveedoresServices {

	public List<Proveedores> listar();
	public Optional<Proveedores> listarId(int Id);
	public int save(Proveedores proveedores);
	public void delete(int Id);
}
