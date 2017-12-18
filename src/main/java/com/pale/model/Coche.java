package com.pale.model;

import javax.annotation.Generated;
import java.util.Objects;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

@Generated(
	value = "DieselsCodeGenerator",
	comments = "Generated business service class",
	date = "Wed Dec 13 16:41:28 CET 2017"
)
@Entity
@Table(name = "T_COCHES", uniqueConstraints = @UniqueConstraint(columnNames = {"marca", "modelo"}))
public class Coche extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "marca", nullable = false)
	private String marca;
	@Column(name = "modelo", nullable = false)
	private String modelo;
	@Column(name = "precio", nullable = false)
	private Double precio;
	@Column(name = "margenPrecio", nullable = false)
	private Double margenPrecio;
	
	Coche() {}
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
			
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Double getMargenPrecio() {
		return this.margenPrecio;
	}
			
	public void setMargenPrecio(Double margenPrecio) {
		this.margenPrecio = margenPrecio;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getMarca(), this.getModelo());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(this.getMarca(), other.getMarca()) && Objects.equals(this.getModelo(), other.getModelo());
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + this.getMarca() + ", modelo=" + this.getModelo() + ", precio=" + this.getPrecio() + ", margenPrecio=" + this.getMargenPrecio() + "]";
	}
	
	
}
