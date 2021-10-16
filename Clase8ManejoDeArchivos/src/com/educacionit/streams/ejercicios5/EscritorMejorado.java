package com.educacionit.streams.ejercicios5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {
	public static void main(String[] args) throws IOException {
		File ouputFile = new File(
				"archivosES" + File.separator + "salida" + File.separator + "bufferedWriterOutput.txt");

		// defino el contenido a escribir en el archivo
		String linea1 = "Hola, soy la primer linea";
		String linea2 = "como estas ? soy la segunda linea";
		String linea3 = "bye , se fue la linea 3";

		// Instanciamos un bufferedWriter
		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(ouputFile));

		// escribimos el archivo de salida a traves de nuestro BufferedWriter
		writerMejorado.write(linea1, 0, linea1.length());
		writerMejorado.newLine();// serapacion de linea

		writerMejorado.write(linea2, 0, linea2.length());
		writerMejorado.newLine();// serapacion de linea

		writerMejorado.write(linea3, 0, linea3.length());
		writerMejorado.newLine();// serapacion de linea

		System.out.println("se copio todas las lineas al archivo " + ouputFile.getName());
		// liberamos recursos
		writerMejorado.close();
	}
}
