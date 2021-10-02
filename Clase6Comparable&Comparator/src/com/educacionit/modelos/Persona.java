package com.educacionit.modelos;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private int altura;
	private Integer edad;

	public Persona(String nombre, int altura, Integer edad) {
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return this.edad.compareTo(o.edad);
	}

}
