package com.diego.examen3.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.examen3.interfaceServices.ICategoriasService;
import com.diego.examen3.interfaceServices.IProductosServices;
import com.diego.examen3.interfaceServices.IProveedoresServices;
import com.diego.examen3.modelo.Categorias;
import com.diego.examen3.modelo.Productos;
import com.diego.examen3.modelo.Proveedores;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private ICategoriasService icategorias;
	
	@Autowired
	private IProveedoresServices iproveedores;
	
	@Autowired
	private IProductosServices iproductos;
	
	//---------------------Categorias---------------------------
	@GetMapping("/listarCategorias")
	public String listarC(Model modelo) {
		List<Categorias> listar = icategorias.listar();
		modelo.addAttribute("categoria", listar);
		return "Categorias";
	}
	
	@GetMapping("/newCategorias")
	public String agregarC(Model modelo) {
		modelo.addAttribute("categoria", new Categorias());
		return "newCategoria";
	}
	
	@PostMapping("/saveCategorias")
	public String saveC(Categorias cat, Model modelo) {
		icategorias.save(cat);
		return "redirect:/listarCategorias";
	}

	@GetMapping("/editarCategorias/{id}")
	public String editarC(@PathVariable int id, Model modelo) {
		Optional<Categorias> categoria = icategorias.listarId(id);
		modelo.addAttribute("categoria", categoria);
		return "modificarCategoria";
	}
	
	@GetMapping("/eliminarCategorias/{id}")
	public String deleteC(@PathVariable int id) {
		icategorias.delete(id);
		return "redirect:/listarCategorias";
	}
	
	//-----------------Proveedores-------------------------------
	@GetMapping("/listarProveedores")
	public String listarP(Model modelo) {
		List<Proveedores> listar = iproveedores.listar();
		modelo.addAttribute("proveedor", listar);
		return "Proveedores";
	}
	
	@GetMapping("/newProveedores")
	public String agregarP(Model modelo) {
		modelo.addAttribute("proveedor", new Proveedores());
		return "newProveedor";
	}
	
	@PostMapping("/saveProveedores")
	public String saveP(Proveedores prov, Model modelo) {
		iproveedores.save(prov);
		return "redirect:/listarProveedores";
	}

	@GetMapping("/editarProveedores/{id}")
	public String editarP(@PathVariable int id, Model modelo) {
		Optional<Proveedores> proveedor = iproveedores.listarId(id);
		modelo.addAttribute("proveedor", proveedor);
		return "modificarProveedores";
	}
	
	@GetMapping("/eliminarProveedores/{id}")
	public String deletePro(@PathVariable int id) {
		iproveedores.delete(id);
		return "redirect:/listarProveedor";
	}
	
	//-----------------Productos-------------------------------
		@GetMapping("/listarProductos")
		public String listarPro(Model modelo) {
			List<Productos> listar = iproductos.listar();
			modelo.addAttribute("producto", listar);
			return "Productos";
		}
		
		@GetMapping("/newProductos")
		public String agregarPro(Model modelo) {
			modelo.addAttribute("producto", new Productos());
			return "newProducto";
		}
		
		@PostMapping("/saveProductos")
		public String savePro(Productos pro, Model modelo) {
			iproductos.save(pro);
			return "redirect:/listarProductos";
		}

		@GetMapping("/editarProductos/{id}")
		public String editarPro(@PathVariable int id, Model modelo) {
			Optional<Productos> producto = iproductos.listarId(id);
			modelo.addAttribute("producto", producto);
			return "modificarProductos";
		}
		
		@GetMapping("/eliminarProductos/{id}")
		public String deleteP(@PathVariable int id) {
			iproductos.delete(id);
			return "redirect:/listarProducto";
		}
}
