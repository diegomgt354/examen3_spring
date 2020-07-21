package com.diego.examen3.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombreCompania", length = 40)
	private String nombreCompania;
	
	@Column(name="nombreContacto", length = 30)
	private String nombreContacto;
	
	@Column(name = "cargoContacto", length = 30)
	private String cargoContacto;
	
	@Column(name="direccion", length = 60)
	private String direccion;
	
	@Column(name="ciudad", length = 15)
	private String ciudad;
	
	@Column(name="region", length = 15)
	private String region;
	
	@Column(name="codigoPostal", length = 15)
	private String codigoPostal;
	
	@Column(name="pais", length = 15)
	private String pais;
	
	@Column(name="telefono", length = 24)
	private String telefono;
	
	@Column(name="fax", length = 24)
	private String fax;
	
	@Column(name="paginaPrincipal", length = 50)
	private String paginaPrincipal;

	public Proveedores() {}
	
	public Proveedores(int id, String nombreCompania, String nombreContacto, String cargoContacto, String direccion,
			String ciudad, String region, String codigoPostal, String pais, String telefono, String fax,
			String paginaPrincipal) {
		super();
		this.id = id;
		this.nombreCompania = nombreCompania;
		this.nombreContacto = nombreContacto;
		this.cargoContacto = cargoContacto;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.telefono = telefono;
		this.fax = fax;
		this.paginaPrincipal = paginaPrincipal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getCargoContacto() {
		return cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPaginaPrincipal() {
		return paginaPrincipal;
	}

	public void setPaginaPrincipal(String paginaPrincipal) {
		this.paginaPrincipal = paginaPrincipal;
	}
	
}
