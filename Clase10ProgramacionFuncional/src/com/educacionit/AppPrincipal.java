package com.educacionit;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class AppPrincipal {

	public static void main(String[] args) {

		/** --------------------------------------- MAP ---------------------------- */

		String[] myVector = new String[] { "bob", "alice", "paul", "ellie" };
		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}

		// comienza comvirtiendo el array en un Stream
		Stream<String> myStream = Arrays.stream(myVector);

		// luego llama al map metodo pasandole una expresion lambda que pueda comvertir
		// el texto a mayusculas
		Stream<String> myNewTream = myStream.map(s -> s.toUpperCase());

		String[] myNewArray = myNewTream.toArray(String[]::new);

		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}

		/**
		 * --------------------------------------- FILTER ----------------------------
		 */

		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(44);
		listaNumeros.add(66);
		listaNumeros.add(55);
		listaNumeros.add(5);
		listaNumeros.add(67);
		listaNumeros.add(89);
		listaNumeros.add(5);
		listaNumeros.add(5);

		Stream st = listaNumeros.stream();

		System.out.println("ocurrencias del numero buscado :");
		System.out.println(st.filter(Predicate.isEqual(5)).count());

		/**
		 * --------------------------------------- REDUCE ----------------------------
		 */

		int myarray[] = { 1, 5, 8 };
		int sum = Arrays.stream(myarray).sum();
		System.out.println("LA SUMA ES : " + sum);

		String[] myarray2 = { "Soy", "Una", "De", "Las", "Ultimas", "Lineas", "De", "Codigo", "Del", "Profe" };
		for (String aux : myarray2) {
			System.out.println(aux);
		}

		String result = Arrays.stream(myarray2).reduce("", (a, b) -> a + b);
		
		System.out.println("RESULTADO DEL REDUCE  " + result);
		
		for (String aux : myarray2) {
			System.out.println(aux);
		}

		
	}

}
