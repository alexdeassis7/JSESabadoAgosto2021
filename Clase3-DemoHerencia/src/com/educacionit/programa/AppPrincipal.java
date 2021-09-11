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
		Double precio = p; // Wrapper

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

		// MASAJE
		System.out.println("Masaje : Solamente el masajista tienen el metodo para dar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
		raulMartinez.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println(
				"Partido de Futbol : Solamente el entrenador y el futbolista tienen metodos para el partido de Futbol");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.jugarPartido();

		System.out.println("*****************************CLASE 4 ******************");
		// NO SE PUEDE INSTANCIAR OBJETOS DE UNA CLASE ABSTRACTA!
		// SeleccionFutbol argentina = new SeleccionFutbol() ;

		// Polimorfismo = Significa "Muchas Formas" , podemos apreciar que la clase
		// "Seleccion Futbol"
		// es una clase que puede adoptar diferentes formas aqui adopta la forma de :
		// entrenador , Masajista , Futbolista .... y toda clase hija
		SeleccionFutbol delBo = new Entrenador();
		SeleccionFutbol ini = new Futbolista();
		SeleccionFutbol raul = new Masajista();

		// vamos a ver como cada uno de los integrantes al ejecutar los mismos métodos
		// (entrenamiento() y partidoFutbol() ) tienen un comportamiento diferente
		// ENTRENAMIENTO
		System.out.println(
				"*************Entrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especialización)");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.entrenamiento();
		}

		//// PARTIDO FUTBOL
		System.out.println(
				"************* partido de Futbol: Todos los integrantes tienen su funcion en un partido (Especialización en futbolista y entrenador )");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.partidoFutbol();
		}

		// por ultimo ejecutamos los metodos propios de cada objeto , seria los metodos
		// que solamente ellos tienen (definidos unicamente en la clase hija)

		// creamos 3 instancias de las clase hijas
		SeleccionFutbol delBosque2 = new Entrenador(1, "Vicente", "Del Bosque", 61, "123ER12");
		SeleccionFutbol iniesta2 = new Futbolista(2, "Andres", "Iniesta", 28, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez2 = new Masajista(3, "Raul", "Martinez", 42, "Licenciado en Fisioterapia", 12);

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"*************Planificar Entrenamiento :  Solo el entrenador tiene el método para planificar un entrenamiento ");
		System.out.println(delBosque2.getNombre() + " " + delBosque2.getApellido());
		((Entrenador) delBosque2).planificarEntrenamiento(); // esta "comversion" es para poder acceder a los metodos
																// propios de la clase hija , ya que al instancialor
																// apuntando
		// a una referencia de SeleccionFutbol no es posible ejecutarlos

		// ENTREVISTA
		System.out.println("*************entrevista:  Solo el futbolista tiene el método para dar una entrevista");
		System.out.println(iniesta2.getNombre() + " " + iniesta2.getApellido());
		((Futbolista) iniesta2).entrevista(); // esta "comversion" es para poder acceder a los metodos propios de la
												// clase hija , ya que al instancialor apuntando
		// a una referencia de SeleccionFutbol no es posible ejecutarlos

		// MASAJE
		System.out.println("*************darMasaje  :  Solo el masajista tiene el método para dar un masaje ");
		System.out.println(raulMartinez2.getNombre() + " " + raulMartinez2.getApellido());
		((Masajista) raulMartinez2).darMasaje(); // esta "comversion" es para poder acceder a los metodos propios de la
													// clase hija , ya que al instancialor apuntando
		// a una referencia de SeleccionFutbol no es posible ejecutarlos

		// el polimorfismo puede ser util a la hora de jerarquizar y querer dar un
		// patrón de comportamiento comun a una serie de objetos
		// que HEREDAN DE LA MISMA CLASE !

		//// PARTIDO FUTBOL
		System.out.println(
				"************* entrenar: Todos los integrantes tienen su funcion en un entrenamiento , este metodo se definio en la interface y se implemento en las clase hijas de la interface ");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.entrenar();
		}

		// comversion implicita
		int numero = 10;
		double precio1 = numero;

		// cateo explicito
		double numero2 = 10;
		int precio2 = (int) numero2;

		/// Interfaces con metodos default TEST

		// RUEDA DE PRENSA CON METODO DEFAULT
		System.out.println(
				"--------------- Todos los integrantes tdan una rueda de prensa , este metodo se definio e implemento en la interface ");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.ruedaPrensa();
		}

		// VIDEO PUBLICITARIO DE PRENSA CON METODO DEFAULT
		System.out.println(
				"--------------- Todos los integrantes graban un video publicitario  , este metodo se definio e implemento en la interface ");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.videoPublicitario();
		}

	}

}
