package com.educacionit;
////ejercicio condicional multiple

import java.util.Scanner;

//1) Desarrollar un algoritmo que permita ingresar un número entero
//comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al 
//que se corresponde. 

public class AppPrincipalTres {

	public static void main(String[] args) {

		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero comprendido entre 1 y 7");
		numero = teclado.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("El numero " + numero + " no se corresponde a un dia de la semana");
			break;
		}

		System.out.println("Fin de la App");
	}

}
