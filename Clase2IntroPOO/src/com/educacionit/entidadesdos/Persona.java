package com.educacionit.entidadesdos;

public class Persona {
	
	//modificadores de acceso :
//	public
//	protected :utilizado en mecanismo de herencia
//	private : no se podra acceder directamente desde fuera de la clase
//	package : solo se puedra acceder desde clases que esten dentro del mismo paquete

	private byte edad;
	private String nombre;
	private String apellido; //por defecto la visibilidad es de package ,pero no se PUEDE definir explicitamente
	private float altura;
	private char sexo;
	// Auto auto = new Auto();
	
	public Persona(String nombre, byte edad, String apellido, float altura, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
		this.altura = altura;
		this.sexo = sexo;
	}

	public Persona() {
	}
	
	// encapsulamiento
	//funcion getters : me sirve para conocer el estado de un atributo de la clase
	public byte getEdad() {
		return edad;
	}
	//PROCEDIMIENTO setters 
	public void setEdad(byte edad) {
		if(edad > 0) {
			this.edad = edad;
			System.out.println("se modifico la edad ");
		}else {
			System.out.println("No se modifico la edad , debe ser un num positivo");
		}
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", altura=" + altura
				+ ", sexo=" + sexo + "]";
	}
	
	

}