package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.educacionit.modelos.OrdenadorPorAltura;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {

		List<Persona> personas = Arrays.asList(new Persona("Leonardo", 187, 22), new Persona("Gonzalo", 173, 52),
				new Persona("Nicole", 158, 27), new Persona("Gustavo", 164, 25), new Persona("Martin", 184, 80));

		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		System.out.println("\n ###################    Personas ordenandas por edad ####################");
		Collections.sort(personas);
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		System.out.println("\n ###################    Personas ordenandas por Altura ####################");
		Collections.sort(personas , new OrdenadorPorAltura());
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		
	}

}
