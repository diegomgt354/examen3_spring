package com.diego.examen3.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.examen3.interfaces.ICategorias;
import com.diego.examen3.modelo.Categorias;

@RestController
@RequestMapping("/restCategorias")
public class restCategorias {

	@Autowired
	private ICategorias data;
	
	@GetMapping
	public List<Categorias> listar(){
		return (List<Categorias>)data.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Categorias categoria) {
		data.save(categoria);
	}
	
	@PutMapping
	public void modificar(@RequestBody Categorias categoria) {
		data.save(categoria);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}
}
