package com.educacionit.streams.ejercicios4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LectorMejorado {

	public static void main(String[] args) throws IOException {
		// instanciamos un objeto File de entrada que se encargara de levantar el
		// archivos fuente.txt
		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		// Instanciamos un bjeto BufferedReader , mediante este objeto podremos leer
		// lias completa en lugar de un
		// unico caracter
		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

		boolean eof = false; // end of file , variable flag que nos estara indicando el final del archivo
		String lineaLeida = "";

		// leo el archivo de una forma mas eficiente
		while (!eof) {
			// lee una linea entera del archivo
			lineaLeida = readerMejorado.readLine();

			// imprime la linea por pantalla
			if (lineaLeida != null) {
				System.out.println(lineaLeida);
			} else {
				// si llego al final del archivo ,modificamos el flag y terminamos loa ejecucion
				eof = true;
			}

		}

		System.out.println("Se termino de leer el archivo linea a linea ");
		// liberamos recursos
		readerMejorado.close();

	}

}
