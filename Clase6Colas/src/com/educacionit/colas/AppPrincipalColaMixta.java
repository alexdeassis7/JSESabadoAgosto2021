package com.educacionit.colas;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AppPrincipalColaMixta {

	public static void main(String[] args) {

		// creamos una cola indicando el tipo de dato generico como "Integer"
		Queue<Integer> cola1 = new LinkedList<>();

		// insertamos datos en la cola
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(76);
		cola1.add(126);
		cola1.add(34);

		// imprimimos la cola
		System.out.println("Cola: " + cola1);

		System.out.println("proximo elemento a desencolar :" + cola1.peek());

		// imprimimos la cola
		System.out.println("Cola: " + cola1);

		// utilizamos una estructura while para desencolar
		while (cola1.poll() != null) {// desencolamos y ese valor desencolado se compara con null para saber si ya se
										// vacio la cola
			System.out.println(cola1);

		}

		// ahora creamos una cola con elementos de diferentes tipos
		LinkedList colaMixta = new LinkedList();

		colaMixta.offer(3);
		colaMixta.add(14.7);
		colaMixta.offer(12);
		colaMixta.add(7);
		colaMixta.offer(10);
		colaMixta.add(10.5);
		colaMixta.offer(3);
		colaMixta.add("gustavo");
		colaMixta.offer("pepe");

		System.out.println("Cola Mixta : " + colaMixta);

		// creamos otra cola
		Queue queue2 = new LinkedList<>();
		
		try {
			queue2.remove();
		} catch (NoSuchElementException e) {
			System.out.println("no podes extraer mas elementos de una cola que esta VACIA!!!");
		}
		
		queue2.add("item4");

		queue2.add("item5");
		System.out.println(queue2);
	}

}
