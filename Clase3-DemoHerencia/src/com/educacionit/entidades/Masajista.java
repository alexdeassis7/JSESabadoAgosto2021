package com.educacionit.entidades;

import com.educacionit.interfaces.IconstantesMensajesError;

//clase hija de SeleccionFutbol
//no se permite la herencia multiple 
//extends : indica cual es la clase padre 
public class Masajista extends SeleccionFutbol implements IconstantesMensajesError{


	private String titulacion;
	private int aniosExperiencia;

	// metodo propio de la clase hija
	public void darMasaje() {		
		System.out.println("darMasaje() - (Clase Hija - Masajista) ");
	}

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	// sobreescribimos metodos de la clase padre
	@Override
	public void entrenamiento() {
		System.out.println("DA asistencia en el entrenamiento (Clase Masajista)");
	}

	@Override
	public void entrenar() {
	System.out.println("Da Asistencia en el entrenamiento  (Clase Masajista)");
		
	}

	@Override
	public void jugarPartido() {
		System.out.println("(Clase Masajista)");
		
	}

}
