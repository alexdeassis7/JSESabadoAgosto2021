package com.educacionit.streams.ejercicios1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	public static void main(String[] args) throws IOException {

		// instanciamos un objeto File de entrada que se encargara de levantar el
		// archivos fuente.txt
		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		// instanciamos un FileReader que se encargara de leer el archivo
		FileReader in = new FileReader(inputFile);

		// declaro una variable donde voy a guardar el caracter que estemos leyendo
		int unCaracter;

		// Leemos el archivo fuente.txt y lo mostramos por consola
		while ((unCaracter = in.read()) != -1) {
			//casteamos el int a un char para volver a ver la frase 
			System.out.print((char)unCaracter);
		}

		// liberamos el recurso
		in.close();
	}
}
