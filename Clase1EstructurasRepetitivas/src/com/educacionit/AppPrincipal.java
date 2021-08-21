package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {

		int contador = 0;
		boolean condicion = true;

		System.out.println("Inicio del While");
		// se ejecute una vez
		// se ejecute N veces
		// nunca se ejecute

		// mostramos los numeros del 0 al 100
		while (contador < 101) {
			// conjunto de sentencias
			System.out.println(contador);
			contador++;
		}

		System.out.println("Fin del While");

		System.out.println("Inicio del do While ");
		// se ejecuta una vez SI o SI
		// se ejecute N veces
		
		// mostramos los numeros del 0 al 100
		contador = 0;
		do {
			// conjunto de sentencias
			System.out.println(contador);
			contador++;
		} while (contador < 101);
		
		System.out.println("Fin del do While");
		
		System.out.println("Inicio del FOR ");
		for (int i = 0; i < 101; i++) {
			// conjunto de sentencias
			System.out.println(i);
		}
		System.out.println("Fin del FOR");
		
				
	}

}
