package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.entidades.*;

public class AppPrincipal {
	// array list : es una Collecion de datos que pertenese al Collection Framework

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		// creamos 3 instancias de las clase hijas
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 61, "123ER12");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 28, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 42, "Licenciado en Fisioterapia", 12);

		// agregamos las 3 instancias al ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		double p = 1.34;
		Double precio = p; //Wrapper

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion . (Todos ejecutan el mismo método)");
		// for each : nos sirve para recorrer colecciones de objetos
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.concentrarse();

		}

		// VIAJAR
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		// for each : nos sirve para recorrer colecciones de objetos
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();

		}

		// ahora vamos a ejecutar el código de las clases hijas , no podemos recorrer el
		// ArrayList y ejecutar el mismo
		// metodo para todos los objetos ya que ahora esos metodos son unicos de las
		// clases hijas

		// Entrenamiento :
		System.out.println("Entrenamiento : Solamente el entrenador y el futbolista tienen metodos para entrenar ");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.entrenar();
		
		//MASAJE
		System.out.println("Masaje : Solamente el masajista tienen el metodo para dar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
		raulMartinez.darMasaje();
		
		//PARTIDO DE FUTBOL
		System.out.println("Partido de Futbol : Solamente el entrenador y el futbolista tienen metodos para el partido de Futbol");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.jugarPartido();	
		
		
		//NO SE PUEDE INSTANCIAR OBJETOS DE UNA CLASE ABSTRACTA!
		//SeleccionFutbol argentina = new SeleccionFutbol() ;
		
		SeleccionFutbol delBo = new Entrenador();
		SeleccionFutbol ini = new Entrenador();
		SeleccionFutbol raul = new Entrenador();
		
		
		

	}

}
