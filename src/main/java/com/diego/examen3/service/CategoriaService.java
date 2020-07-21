package com.diego.examen3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.examen3.interfaceServices.ICategoriasService;
import com.diego.examen3.interfaces.ICategorias;
import com.diego.examen3.modelo.Categorias;

@Service
public class CategoriaService implements ICategoriasService{

	@Autowired
	private ICategorias data;
	
	@Override
	public List<Categorias> listar() {
		return (List<Categorias>)data.findAll();
	}

	@Override
	public Optional<Categorias> listarId(int Id) {
		return data.findById(Id);
	}

	@Override
	public int save(Categorias categoria) {
		int respuesta = 0;
		Categorias catego = data.save(categoria);
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
