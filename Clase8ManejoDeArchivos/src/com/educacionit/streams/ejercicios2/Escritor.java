package com.educacionit.streams.ejercicios2;

import java.io.*;

import javax.swing.JOptionPane;

public class Escritor {

	public static void main(String[] args) throws IOException {

		// instanciamos un objeto file que levanta el archivo destino.txt si es que
		// existe
		// en caso contrario lo creara!
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		// Instanciamos un FileWriter que se encargara de escribir el archivo
		// "destino.txt"
		//FileWriter out = new FileWriter(outputFile); //aqui no se realizara un append , se borra y escribe el archivo de cero
		
		//hacemos un append para que nos nos pise el texto que ya estaba escrito 
		FileWriter out = new FileWriter(outputFile, true);

		// solicitamos al usuario el texto que vamos a escribir en el archivo
		// destino.txt
		String info = JOptionPane.showInputDialog("ingrese el texto a guardar en el archivo destino.txt");

		// Escribimos la informacion ingresada por el usuario dentro del archivo
		// destino.txt
		for (int i = 0; i < info.length(); i++) {
			out.write(info.charAt(i)); // leo caracter a caracter y escribo
		}

		// cierro el escritor para liberar el recurso
		out.close();

		// informamos al usuario que ya se termino de escribir el archivo
		System.out.println("El archivo ah sido escrito correctamente !!!!!");
	}
}
