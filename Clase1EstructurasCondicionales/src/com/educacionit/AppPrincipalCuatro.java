package com.educacionit;
//ejercicio 2 condicional multiple

//2) Desarrollar un algoritmo que permita ingresar un número entero 
//comprendido entre 1 y 10, y que muestre por pantalla si el número es par o 
//impar.

import java.util.Scanner;

public class AppPrincipalCuatro {

	public static void main(String[] args) {

		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero comprendido entre 1 y 10");
		numero = teclado.nextInt();

		if (numero >= 1 && numero <= 10) {
			switch (numero) {
			case 1, 3, 5, 7, 9:
				System.out.println("Numero impar");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("Numero Par");
				break;
			}
		} else {
			System.out.println("el numero ingresado no se encuentra dentro del rango solicitado");
		}

		System.out.println("Fin de la app");
	}

}
