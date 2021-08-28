package com.educacionit.programa;

import com.educacionit.entidades.Direccion;
import com.educacionit.entidades.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		// creamos una instancia direccion
		Direccion d1 = new Direccion("Avenida Siempre viva", 1445, 3230, "Buenos Aires", "Argentina");
		d1.setAltura(1450);
		
		System.out.println("d1.toString()" + d1.toString());
		System.out.println();

		// Creamos una instancia de personaç
		byte edad = 56;
		Persona p1 = new Persona("Homero", "Simpsond", edad, d1);
		System.out.println("d1.toString()" + p1.toString());
	}
}
