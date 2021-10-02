package com.educacionit.modelos;

import java.util.Comparator;

public class OrdenadorPorAltura implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return (o1.getAltura() - o2.getAltura());
	}

}
