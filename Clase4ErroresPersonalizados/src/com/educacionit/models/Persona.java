package com.educacionit.models;

import com.educacionit.errores.personalizados.MiPropiaException;

public class Persona {

	private int id;
	private String nombre;

	public void metodoQuePuedeGenerarUnError(boolean lanzarError) throws MiPropiaException {

		if (lanzarError) {
			// lanzamos nuestra Exceptio personalizada
			throw new MiPropiaException("este mensaje me vino desde donde se lanzo la exception");
		} else {
			System.out.println("el metodo se ejecuto de maravilla , no se Lanzo ninguna Exception personalizada");
		}

	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
