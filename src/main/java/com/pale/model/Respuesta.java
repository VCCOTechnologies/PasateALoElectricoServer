package com.pale.model;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Generated(
	value = "DieselsCodeGenerator",
	comments = "Generated business service class",
	date = "Wed Dec 13 16:41:28 CET 2017"
)
@Entity
@Table(name = "T_RESPUESTAS", uniqueConstraints = @UniqueConstraint(columnNames = {"texto"}))
public class Respuesta extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "texto", nullable = false)
	private String texto;
	@ManyToOne(optional = true)
	@JsonIgnore
	private Pregunta pregunta;
	
	Respuesta() {}
	
	public Respuesta(String texto) {
		super();
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getTexto());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Respuesta other = (Respuesta) obj;
		return Objects.equals(this.getTexto(), other.getTexto());
	}
	
	@Override
	public String toString() {
		return "Respuesta [texto=" + this.getTexto() + "]";
	}
	
	
	void _setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	
	public Pregunta getPregunta() {
		return this.pregunta;
	}
	
}
