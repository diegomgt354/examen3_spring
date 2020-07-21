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

import com.diego.examen3.interfaces.IProveedores;
import com.diego.examen3.modelo.Proveedores;

@RestController
@RequestMapping("/restProveedores")
public class restProveedores {

	@Autowired
	private IProveedores data;
	
	@GetMapping
	public List<Proveedores> listar(){
		return (List<Proveedores>)data.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Proveedores proveedores) {
		data.save(proveedores);
	}
	
	@PutMapping
	public void modificar(@RequestBody Proveedores proveedores) {
		data.save(proveedores);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}
}
