package com.pale.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pale.model.Associations;
import com.pale.model.Coche;
import com.pale.model.Pregunta;
import com.pale.model.Respuesta;

@RestController
public class TestRestController {

	@RequestMapping(value = "/preguntas", method = RequestMethod.GET)
	public List<Pregunta> getPreguntas() {
		List<Pregunta> preguntas = new ArrayList<>();
		Pregunta p1 = new Pregunta("¿pregunta 1?");
		p1.setDescripcion("Descripción de la pregunta numero 1");
		Pregunta p2 = new Pregunta("¿pregunta 2?");
		p2.setDescripcion("Descripción de la pregunta numero 2");

		Respuesta r1 = new Respuesta("Respuesta 1");
		Respuesta r2 = new Respuesta("Respuesta 2");
		Respuesta r3 = new Respuesta("Respuesta 3");

		Associations.Contiene.link(p1, r1);
		Associations.Contiene.link(p1, r2);
		Associations.Contiene.link(p1, r3);

		Associations.Contiene.link(p2, r1);
		Associations.Contiene.link(p2, r2);
		Associations.Contiene.link(p2, r3);

		preguntas.add(p1);
		preguntas.add(p2);

		return preguntas;
	}

	@RequestMapping(value = "/coche", method = RequestMethod.GET)
	public Coche pendingActivities() {
		return new Coche("BMW", "i8");
	}

}
