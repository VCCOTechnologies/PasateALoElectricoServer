package com.pale.model;

import javax.annotation.Generated;
import java.util.Objects;
import java.util.HashSet;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;
import javax.persistence.OneToMany;
import java.util.Set;

@Generated(
	value = "DieselsCodeGenerator",
	comments = "Generated business service class",
	date = "Wed Dec 13 16:41:28 CET 2017"
)
@Entity
@Table(name = "T_PREGUNTAS", uniqueConstraints = @UniqueConstraint(columnNames = {"texto"}))
public class Pregunta extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "texto", nullable = false)
	private String texto;
	@OneToMany(mappedBy = "pregunta")
	private Set<Respuesta> respuestas = new HashSet<>();
	
	Pregunta() {}
	
	public Pregunta(String texto) {
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
		Pregunta other = (Pregunta) obj;
		return Objects.equals(this.getTexto(), other.getTexto());
	}
	
	@Override
	public String toString() {
		return "Pregunta [texto=" + this.getTexto() + "]";
	}
	
	
	Set<Respuesta> _getRespuestas() {
		return this.respuestas;
	}
	
	public Set<Respuesta> getRespuestas() {
		return new HashSet<>(respuestas);
	}
	
}
