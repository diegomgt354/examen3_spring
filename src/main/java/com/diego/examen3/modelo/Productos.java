package com.diego.examen3.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreProducto", length = 40)
	private String nombreProducto;
	
	@ManyToOne
	private Proveedores idProveedor;
	
	@ManyToOne
	private Categorias idCategoria;
	
	@Column(name = "cantidadPorUnidad", length = 20)
	private String cantidadPorUnidad;
	
	@Column(name="precioUnidad")
	private int precioUnidad;

	@Column(name="unidadesEnExistencia")
	private int unidadesEnExistencia;
	
	@Column(name="unidadesEnPedido")
	private int unidadesEnPedido;
	
	@Column(name="nivelNuevoPedido")
	private int nivelNuevoPedido;
	
	@Column(name="suspendido")
	private int suspendido;
	
	@Column(name="categoriaProducto", length = 20)
	private String categoriaProducto;
	
	public Productos() {}

	public Productos(int id, String nombreProducto, Proveedores idProveedor, Categorias idCategoria,
			String cantidadPorUnidad, int precioUnidad, int unidadesEnExistencia, int unidadesEnPedido,
			int nivelNuevoPedido, int suspendido, String categoriaProducto) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.idProveedor = idProveedor;
		this.idCategoria = idCategoria;
		this.cantidadPorUnidad = cantidadPorUnidad;
		this.precioUnidad = precioUnidad;
		this.unidadesEnExistencia = unidadesEnExistencia;
		this.unidadesEnPedido = unidadesEnPedido;
		this.nivelNuevoPedido = nivelNuevoPedido;
		this.suspendido = suspendido;
		this.categoriaProducto = categoriaProducto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Proveedores getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedores idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Categorias getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categorias idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCantidadPorUnidad() {
		return cantidadPorUnidad;
	}

	public void setCantidadPorUnidad(String cantidadPorUnidad) {
		this.cantidadPorUnidad = cantidadPorUnidad;
	}

	public int getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getUnidadesEnExistencia() {
		return unidadesEnExistencia;
	}

	public void setUnidadesEnExistencia(int unidadesEnExistencia) {
		this.unidadesEnExistencia = unidadesEnExistencia;
	}

	public int getUnidadesEnPedido() {
		return unidadesEnPedido;
	}

	public void setUnidadesEnPedido(int unidadesEnPedido) {
		this.unidadesEnPedido = unidadesEnPedido;
	}

	public int getNivelNuevoPedido() {
		return nivelNuevoPedido;
	}

	public void setNivelNuevoPedido(int nivelNuevoPedido) {
		this.nivelNuevoPedido = nivelNuevoPedido;
	}

	public int getSuspendido() {
		return suspendido;
	}

	public void setSuspendido(int suspendido) {
		this.suspendido = suspendido;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
	
}
