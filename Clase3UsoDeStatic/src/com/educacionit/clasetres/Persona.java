package com.educacionit.clasetres;

public class Persona {

	private String nombre;
	private int edad;
	private static int contadorPersonas = 0; // atributo de clase!

	// metodo statico que pertenece a la clase y me permite conocer
	// el estado del atributo estatico
	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contadorPersonas++;
	}

	// metodo estatico que me permite modificar atributo static
//	public static void setContadorPersonas(int contadorPersonas) {
	// no podemos utilizar el this ya que el atributo static
	// no lñe pertenece al objeto sino a la clase
	// this.contadorPersonas = contadorPersonas;
//		Persona.contadorPersonas = contadorPersonas;
//	}

	public static void incrementarContador() {
		// un metodo estaticos SOLO puede acceder a atributos estaticos
		// this.nombre = "alex";
		contadorPersonas++;
	}

	public static void decrementarContador() {
		// un metodo estaticos SOLO puede acceder a atributos estaticos
		// this.nombre = "alex";
		contadorPersonas--;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
