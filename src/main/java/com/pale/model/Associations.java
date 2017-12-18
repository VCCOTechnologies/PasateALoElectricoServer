package com.pale.model;

import javax.annotation.Generated;

@Generated(
	value = "DieselsCodeGenerator",
	comments = "Generated business service class",
	date = "Wed Dec 13 16:41:28 CET 2017"
)
public class Associations {

	public static class Contiene {
	    public static void link(Pregunta pregunta, Respuesta respuestas) {
	    	respuestas._setPregunta(pregunta);					
	    	pregunta._getRespuestas().add(respuestas);
	    }
	
	    public static void unlink(Pregunta pregunta, Respuesta respuestas) {
	    	pregunta._getRespuestas().remove(respuestas);
	    	respuestas._setPregunta(null);
	    }
	}
	
}