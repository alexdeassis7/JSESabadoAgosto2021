package com.educacionit.colas;

import java.util.PriorityQueue;

public class AppPrincipalPriorityQueue {

	// Demo PriorityQueue : es una variante de una cola clàsica que la implementa la
	// clase PriorityQueue
	// esto permite que cuando se agregan elementos a la cola se organizan segun su
	// valor , por ejemplo :
	// si es un numero se organizan de menor a mayor

	public static void main(String[] args) {

		// ejemplos de como se organizan los valores en una cola con prioridad

		// creamos un objeto de la clase PriorityQueue que almacene algun tipo de
		// objetos (Integer ,String , Persona .... etc)

		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();

		// Cargamos  6 objetos en la cola de prioridad
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(76);
		cola1.add(126);
		cola1.add(34);
		System.out.println("Imprimimos la cola con prioridades de enteros");

		// mediante un while comenzamos a recuperar lso elementos de la cola con
		// prioridad
		// y podemos comprobar que el primero de la cola es el que tiene el valor 6 ,
		// luego el 70 y finalmente el 120

		while (!cola1.isEmpty()) {
			System.out.print(cola1.poll() + " -");
		}

	}

}
