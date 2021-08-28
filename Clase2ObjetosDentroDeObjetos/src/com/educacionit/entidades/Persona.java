package com.educacionit.entidades;

public class Persona {

	private String nombre;
	private String apellido;
	private byte edad;
	private Direccion direc;

	public Persona() {
	}

	public Persona(String nombre, String apellido, byte edad, Direccion direc) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direc = direc;
	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public Direccion getDirec() {
		return direc;
	}

	public void setDirec(Direccion direc) {
		this.direc = direc;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direc=" + direc + "]";
	}
	
	

}
