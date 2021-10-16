package com.educacionit.streams.ejercicios3;

import java.io.*;

public class Copiador {

	public static void main(String[] args) throws IOException {

		// instanciamos un objeto File (origen.txt) de entrada desde donde copiaremos el
		// texto y otro File (destino.txt) de salida hacia donde pegaremos lo copiado de
		// origen.txt
		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "origen.txt");
		File ouputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		// Instanciamosun FileReader y un FileWriter que se encargara de leer y escribir
		// los archivos
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(ouputFile);

		// instanciamos una variable que contendra el caracter a leer
		int unCaracter;

		// informamos por consola que se esta copiadno el archivo
		System.out.println("El archivo " + inputFile.getName() + " ubicado en la ruta " + inputFile.getAbsolutePath()
				+ " esta siendo copiado...");

		// leemos el archivo en origen y copiamos la info al archivo de destino
		while ((unCaracter = in.read()) != -1) {
			out.write(unCaracter); // escribo en el archivo de destino
		}

		// liberamos los recursos
		in.close();
		out.close();

		// informamos que se ah copiado el archivo
		System.out.println(
				"El archivo " + inputFile.getName() + " se copio con exito en el archivo " + ouputFile.getName());
	}

}
