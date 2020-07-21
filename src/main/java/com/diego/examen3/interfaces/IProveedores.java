package com.diego.examen3.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diego.examen3.modelo.Proveedores;

@Repository
public interface IProveedores extends CrudRepository<Proveedores, Integer>{

}
