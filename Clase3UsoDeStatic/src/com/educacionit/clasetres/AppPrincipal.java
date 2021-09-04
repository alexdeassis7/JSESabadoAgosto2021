package com.educacionit.clasetres;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("Inicio de la app");

		Persona leo = new Persona("Leo", 25);
		Persona michelle = new Persona("Michelle", 22);
		Persona hugo = new Persona("Hugo", 26);
		Persona p1 = new Persona("pepe", 26);
		Persona p2 = new Persona("Pedro", 26);

		//System.out.println("leo modifico el atributo static - SE MODIFICA PARA TODAS LAS INSTANCIAS");
		// los objetos tambien pueden acceder al atributo /metodo static
		//leo.setContadorPersonas(5);
		System.out.println("leo.getContadorPersonas() " + leo.getContadorPersonas());
		System.out.println("michelle.getContadorPersonas() " + michelle.getContadorPersonas());
		System.out.println("hugo.getContadorPersonas() " + hugo.getContadorPersonas());

	//	System.out.println("michelle modifico el atributo static - SE MODIFICA PARA TODAS LAS INSTANCIAS");
//		michelle.setContadorPersonas(15);
		System.out.println("leo.getContadorPersonas() " + leo.getContadorPersonas());
		System.out.println("michelle.getContadorPersonas() " + michelle.getContadorPersonas());
		System.out.println("hugo.getContadorPersonas() " + hugo.getContadorPersonas());

		// accedo a un atributo statico sin instanciar objetos de la clase
		System.out.println("Exiten " + Persona.getContadorPersonas() + " Objetos de la clase persona Creados");

		System.out.println("Fin de la App");

	}

}
