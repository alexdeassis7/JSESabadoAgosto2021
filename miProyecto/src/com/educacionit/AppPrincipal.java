package com.educacionit;

import java.util.Scanner;

//comentario de linea  : atajo ctrl + shift + c
/* soy un comentario en bloque
 */
// identado de codigo : ctrl + shift +f

public class AppPrincipal {
	// Problema secuencial
	// ejercicio 1 :
//	Suponga que un individuo desea invertir su capital en un banco y desea saber cuanto dinero ganara
//	despues de un mes si el banco paga a rzon de 2% mensual

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float capital = 0, ganancia = 0;
		final float PORCENTAJE = 0.02f;

		// solicito los datos
		System.out.println("Cuanto dinero desea invertir este mes en el banco");
		capital = teclado.nextFloat();

		// proceso la informacion
		ganancia = capital * PORCENTAJE;

		System.out.println("la Ganacia sera de " + ganancia);

		teclado.close();
	}

}
