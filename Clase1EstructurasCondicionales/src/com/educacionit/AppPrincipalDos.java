package com.educacionit;

import java.util.Scanner;

//Condicional Doble

//1) Desarrollar un algoritmo que permita determinar si un número 
//ingresado por teclado es positivo o negativo. 

public class AppPrincipalDos {

	public static void main(String[] args) {

		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numeor distinto de cero");
		numeroIngresado = teclado.nextInt();

		if (numeroIngresado > 0) {
			System.out.println("En numero ingresado es positivo ");
		} else {
			System.out.println("En numero ingresado es negativo ");
		}

		teclado.close();
	}

}
