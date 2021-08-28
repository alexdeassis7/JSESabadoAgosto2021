package com.educacionit.entidades;

//definimos una clase llamada auto 
//Clase : plantilla o template que me sirve para crear N objetos (fabrica de objetos)
public class Auto {

	// atributos de la clase auto
	// estos definene las caracteristicas de los objetos
	String color, modelo, marca;
	float litrosCombustible = 0;
	float capacidaMaxDeCombustible = 0;
	byte puertas;

	//metodos constructores :  nos sisrven para instanciar los objetos 
	//un metodo siempre me retorna una nueva instancia de la clase en la que este definido 
	//y tiene que llamarse SI o SI igual a la clase!!!
	
	//defino el constructor Vacio de manera EXPLICITA  
	public Auto() {
		
	}

	//contructor con parametros 

	public Auto(String color, String modelo, String marca, float litrosCombustible, float capacidaMaxDeCombustible,
			byte puertas) {
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.litrosCombustible = litrosCombustible;
		this.capacidaMaxDeCombustible = capacidaMaxDeCombustible;
		this.puertas = puertas;
	}

	public Auto(String modelo, String marca, float litrosCombustible, float capacidaMaxDeCombustible, byte puertas) {
		this.modelo = modelo;
		this.marca = marca;
		this.litrosCombustible = litrosCombustible;
		this.capacidaMaxDeCombustible = capacidaMaxDeCombustible;
		this.puertas = puertas;
	}

	// declaramos los metodos de la clase : estos definene el comportamiento de la
	// misma
	// tenemos dos tipos de metodos:
	// funciones : tienen return y nos retornan "algo"
	// procedimientos : son void , no retornan nada cuando se llaman

	
	void acelerar(float kmXhs) {
		System.out.println("soy un " + marca + " " + modelo + " y acelero a " + kmXhs + " x HS.");
	}
	

	void acelerar() {
		System.out.println("soy un " + marca + " " + modelo + " y acelero ");
	}
	
	void acelerar(String calle) {
		System.out.println("soy un " + marca + " " + modelo + " y acelero por la calle " + calle );
	}

	void frenar() {
		System.out.println("estoy frenando el motor");
	}

	String cargarCombustible(float litrosAcargar) {

		if ((litrosCombustible + litrosAcargar) <= capacidaMaxDeCombustible) {
			// cargamos el tanque solo si tenemos capacidad
			litrosCombustible += litrosAcargar;
			return "Se cargo " + litrosAcargar + " litros al tanque";

		} else {
			return "no se puede cargar " + litrosAcargar + " Litros por que su tanque ya tiene  " + litrosCombustible
					+ " Litros y su capacidad maxima es " + capacidaMaxDeCombustible + " litros";
		}

	}
	
	public String toString() {
		return "Auto [color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", litrosCombustible="
				+ litrosCombustible + ", capacidaMaxDeCombustible=" + capacidaMaxDeCombustible + ", puertas=" + puertas
				+ "]";
	}

}
