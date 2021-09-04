package com.educacionit.entidades;

//clase padre Abstract : solo la utilizamos para realizar mecanismos de herencia , NO SE PODRA crear objetos de esta clase NUNCA en la app
public abstract class SeleccionFutbol {
	
	// atributos comunes a todas las clases
	
	//modficador de acceso "protected" sirve para indicar un tipo de visibilidad de los atributos métodos de la clase padre
	//y significa que solo es visible ese atributo o metodo desde las clases hijas y NO DESDE OTRAS CLASES
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public SeleccionFutbol() {
	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("concentrarse() - (Clase Padre: SeleccionFutbol)");
	}

	public void viajar() {
		System.out.println("viajar() - (Clase Padre: SeleccionFutbol)");
	}

	//IMPORTANTE -> METODO ABSTRACTO => No se implementa en la clase Abstracta pero si en la clase hijas
	//no podemos tener un metodo abstract dentro de una clase no abstract, pero si podemos 
	//tener una clase abstrac sin tener metodos abtractos 
	//* una clase abstract puede tener N metodos abstract
	public abstract void entrenamiento() ;
	
	public void partidoFutbol() {
		System.out.println("Asiste al Partido de Fútbol - partidoFutbol()  -(Clase Padre: SeleccionFutbol)");
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
