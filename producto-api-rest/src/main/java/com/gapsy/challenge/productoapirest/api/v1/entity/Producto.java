package com.gapsy.challenge.productoapirest.api.v1.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column(name = "id_articulo", nullable = false)
	private String idArticulo;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "precio", nullable = false)
	private BigDecimal precio;

	@Column(name = "modelo", nullable = false)
	@Size(min = 1, max = 10)
	@NotBlank
	private String modelo;

	public String getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Articulo [idArticulo=" + idArticulo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", modelo=" + modelo + "]";
	}

}
