package com.educacionit;

import java.util.Scanner;

//4) Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna
//como un porcentaje de su salario mensual que depende de su antig?edad en la empresa de acuerdo con la siguiente tabla
//Tiempo									Utilidad
//Menos de 1 a?o						5% del salario
//1 a?o o m?s y menos de 2 a?os 		7% del salario
//2 a?os o m?s y menos de 5 a?os		10% del salario
//5 a?os o m?s y menos de 10 a?os		15% del salario
//10 a?os o mas 						20% del salario
public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salarioMensual = 0, antiguedad = 0, utilidad = 0;

		System.out.println("Ingrese por favor su salario mensual");
		salarioMensual = teclado.nextFloat();

		System.out.println("Ingrese por favor su antiguedad en la empresa");
		antiguedad = teclado.nextFloat();
		// ejemplo de condicional anidado
		if (antiguedad > 0 && antiguedad< 1) {
			utilidad = salarioMensual * 0.05f;
		} else if ((antiguedad >= 1) && (antiguedad < 2)) {
			utilidad = salarioMensual * 0.07f;
		} else if ((antiguedad >= 2) && (antiguedad < 5)) {
			utilidad = salarioMensual * 0.10f;
		} else if ((antiguedad >= 5) && (antiguedad < 10)) {
			utilidad = salarioMensual * 0.15f;
		} else {
			utilidad = salarioMensual * 0.20f;
		}
		System.out.println("La utilidad es de " + utilidad);

		System.out.println("fin de la app ");
	}

}
