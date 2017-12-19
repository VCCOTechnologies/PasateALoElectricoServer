package com.pale.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Generated(value = "DieselsCodeGenerator", comments = "Generated business service class", date = "Wed Dec 13 16:41:28 CET 2017")
@Entity
@Table(name = "T_PREGUNTAS", uniqueConstraints = @UniqueConstraint(columnNames = { "titulo" }))
public class Pregunta extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;

	@OneToMany(mappedBy = "pregunta")
	private Set<Respuesta> respuestas = new HashSet<>();

	Pregunta() {
	}

	public Pregunta(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getTitulo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pregunta other = (Pregunta) obj;
		return Objects.equals(this.getTitulo(), other.getTitulo());
	}

	@Override
	public String toString() {
		return "Pregunta [texto=" + this.getTitulo() + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	Set<Respuesta> _getRespuestas() {
		return this.respuestas;
	}

	public Set<Respuesta> getRespuestas() {
		return new HashSet<>(respuestas);
	}

}
