package com.educacionit;

public class AppPrincipal {
	public static int numerador = 10;
	public static int denominador = 0;
	public static float division;

	public static void main(String[] args) {

//		1)
		System.out.println("Inicio de la app");
		System.out.println("Antes de hacer la division");

//		2)
		try {
			division = numerador / denominador;
		} catch (ArithmeticException e) { // "e" es el nombre del objeto que contendra al error producido y a todo su
											// estado
			// si sucede una exception doy valor '0' al atributo 'division'
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			System.out.println("Se lanzo una Exception , y entro al catch");
		} finally {
			// 3)
			System.out.println("División: " + division);
			System.out.println("Fin de la app");

		}

		/*
		 * // en esta estructura se puede omitir el bloque f o el bloque catch pero NO
		 * // AMBOS! try { // Instrucciones que podrian llegar a lanzar una Exception
		 * 
		 * } catch (Exception e) { // instrucciones a ejecutar suando se produce una
		 * Exception dentro de try } finally { //Isntrucciones a ejecutar , tanto si hay
		 * como si hay excepciones }
		 */

	}
}
