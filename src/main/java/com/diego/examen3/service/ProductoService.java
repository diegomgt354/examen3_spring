package com.diego.examen3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.examen3.interfaceServices.IProductosServices;
import com.diego.examen3.interfaces.IProductos;
import com.diego.examen3.modelo.Productos;

@Service
public class ProductoService implements IProductosServices{

	@Autowired
	private IProductos data;
	
	@Override
	public List<Productos> listar() {
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> listarId(int Id) {
		return data.findById(Id);
	}

	@Override
	public int save(Productos producto) {
		int respuesta = 0;
		Productos catego = data.save(producto);
		if(!catego.equals(null)) {
			respuesta = 1;
		}
		return respuesta;
	}

	@Override
	public void delete(int Id) {
		data.deleteById(Id);
	}
}
