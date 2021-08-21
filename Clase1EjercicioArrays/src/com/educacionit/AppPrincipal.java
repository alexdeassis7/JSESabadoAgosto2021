package com.educacionit;

//2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno del vector A con el
//elemento uno del vector B y así sucesivamente hasta 45, almacenar el resultado en un vector C,
//e imprimir el vector resultante por pantalla.
public class AppPrincipal {

	public static void main(String[] args) {
		final int CANTIDAD_DE_ELEMENTO = 45;

		int vectorA[] = new int[CANTIDAD_DE_ELEMENTO];
		int vectorB[] = new int[CANTIDAD_DE_ELEMENTO];
		int vectorC[] = new int[CANTIDAD_DE_ELEMENTO];

		System.out.println("cantida de elemento de vectorA es : " + vectorA.length);

		for (int i = 0; i < CANTIDAD_DE_ELEMENTO; i++) {
			// cargamos los vectores con numeros ramdom
			vectorA[i] = (int) (Math.random() * 100);
			vectorB[i] = (int) (Math.random() * 100);
			vectorC[i] = vectorA[i] + vectorB[i];
			// mostramos los vectores

			System.out.println(vectorA[i] + "+" + vectorB[i] + "= " + vectorC[i]);
		}

	}

}
