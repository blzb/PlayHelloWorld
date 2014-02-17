package controllers;

import java.util.HashSet;
import java.util.Set;

import play.mvc.Controller;
import play.mvc.Result;
import models.Persona;
import views.html.persona.*;

public class PersonaController extends Controller {
	public static Result lista(){
		Set<Persona> personas = new HashSet<Persona>();
		Persona p1 = new Persona();
		p1.nombre="Angel Francisco";
		p1.apellidos="Pimentel Meza";
		personas.add(p1);
		Persona p2 = new Persona();
		p2.nombre="Carlos ";
		p2.apellidos="Navarrete del Bosque";
		personas.add(p2);
		return ok(lista.render(personas));
	}
}
