package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		// ejemplo condicional simple
// 1) Implementar un algoritmo que calcule y muestre por pantalla el valor 
//final de la compra de un artículo. El algoritmo debe permitir el ingreso del 
//precio del artículo y la cantidad de artículos. Si el subtotal es superior a 
//1000, entonces se debe aplicar un descuento del 10 %.
		Scanner teclado = new Scanner(System.in);
		int cantidad = 0;
		float precio = 0, descuento = 0, subTotal = 0, totalCompra = 0;

		System.out.println("Ingrese el precio del articulo ");
		precio = teclado.nextFloat();

		System.out.println("Ingrese la cantidad de articulos a comprar ");
		cantidad = teclado.nextInt();

		subTotal = precio * cantidad;

		if (subTotal > 1000) {
			descuento = subTotal * 0.10f;
		}

		totalCompra = subTotal - descuento;

		if (descuento > 0) {
			System.out.println("Se aplicó un descuento de " + descuento);
		}

		System.out.println("El valor final de la compra es : " + totalCompra);

		teclado.close();
		
		
		
	}

}
