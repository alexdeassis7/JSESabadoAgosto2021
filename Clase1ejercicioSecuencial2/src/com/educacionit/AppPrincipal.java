package com.educacionit;

import java.util.Scanner;

//Enunciado :Un Maestro desea saber que porcentaje de hombres y que porcentaje de mujeres
// hay en un grupo de alumnos 
public class AppPrincipal {

	public static void main(String[] args) {
		float porcentajeHombres = 0, porcentajeMujeres = 0, totalAlumnos = 0;
		int numHombres = 0, numMujeres = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese el numero de hombres");
		numHombres = teclado.nextInt();

		System.out.println("ingrese el numero de mujeres");
		numMujeres = teclado.nextInt();

		totalAlumnos = numHombres + numMujeres;
		porcentajeHombres = (numHombres * 100) / totalAlumnos;
		porcentajeMujeres = (numMujeres * 100) / totalAlumnos;

		System.out.println("El porcentaje de mujeres es  : " + porcentajeMujeres);
		System.out.println("El porcentaje de hombres es  : " + porcentajeHombres);
	}

}
