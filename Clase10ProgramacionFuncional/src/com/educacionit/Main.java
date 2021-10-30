package com.educacionit;

//LEER ESTE TUTORIAL :https://javadesdecero.es/avanzado/expresiones-lambda-java/
public class Main {

	public static void main(String[] args) {

		// crea una referencia a una intancia de MiValor
		MiValor miVal;

		// a continuacion , se asigna una expresion lambda a esa referencia
		// de interface:
		// Usa una lambda en un contexto de asignacion
		miVal = () -> 28.6;
//        Esta expresion es compatible con getValor()	porque al igual que getVAlor() , no tiene param 
//        y retorna un resultado double
		// si no son compatible se genera un error en tiempo de compilacion

		// los dos pasos que se muestra arriba pueden combinarse en una sola declaracion
		// si lo desea :
		MiValor miVal2 = () -> 3.8;

		// llama a getValor , que se implementa mediante la expresion lambda
		// asignada previamente
		System.out.println("Un valor constante : " + miVal.getValor());
		System.out.println("Otro valor constante : " + miVal2.getValor());

		// MiValorParam DEMO :
		// estaremos esta interface para implementar la lamba reciproca
		MiValorParam miValor = (n) -> 1.0 / n;
		System.out.println("el reciproco de 4.0 es :" + miValor.getValor(4.0));
	
		MiValorParam miValor2 = (double n) -> 1.0 / n;
		System.out.println("el reciproco de 4.0 es :" + miValor2.getValor(4.0));
			
	}

}


















