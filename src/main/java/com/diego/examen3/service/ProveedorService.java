package com.diego.examen3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.examen3.interfaceServices.IProveedoresServices;
import com.diego.examen3.interfaces.IProveedores;
import com.diego.examen3.modelo.Proveedores;

@Service
public class ProveedorService implements IProveedoresServices{

	@Autowired
	private IProveedores data;
	
	@Override
	public List<Proveedores> listar() {
		return (List<Proveedores>)data.findAll();
	}

	@Override
	public Optional<Proveedores> listarId(int Id) {
		return data.findById(Id);
	}

	@Override
	public int save(Proveedores proveedor) {
		int respuesta = 0;
		Proveedores prov = data.save(proveedor);
		if(!prov.equals(null)) {
			respuesta = 1;
		}
		return respuesta;
	}

	@Override
	public void delete(int Id) {
		data.deleteById(Id);
	}

}
