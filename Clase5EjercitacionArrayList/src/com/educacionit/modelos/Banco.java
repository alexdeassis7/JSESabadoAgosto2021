package com.educacionit.modelos;

import java.util.ArrayList;

public class Banco {
	public ArrayList<Persona> fila = new ArrayList();

	public int cuantasPersonasHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {
		// fila.contains(persona) = chequeamos si la lista contiene al objeto persona
		if (!fila.contains(persona)) {// chequeamos que la persona no este en la fila
			// agregamos a la persona a la fila
			fila.add(persona);
		} else {
			System.out.println("La persona con DNI :" + persona.getDni() + " Ya se encuentra en la fila del banco");
		}
	}

	public void eliminarPersonaDeFila(Persona persona) {
		if (fila.contains(persona)) { // chequeamos si la persona existe
			fila.remove(persona);
			System.out.println("Se removio de la fila a " + persona.getNombre());
		} else {
			System.out.println(persona.getNombre() + " No se encuentra dentro de la fila del banco ");
		}
	}

	public void mostrarLaFila() {
		System.out.println("Mostramos las fila completa : ");
		for (Persona personaAux : fila) {
			System.out.println("Nombre : " + personaAux.getNombre() + ", DNI :" + personaAux.getDni());
		}
	}
}
