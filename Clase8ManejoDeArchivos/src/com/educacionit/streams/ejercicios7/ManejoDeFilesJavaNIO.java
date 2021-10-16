package com.educacionit.streams.ejercicios7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ManejoDeFilesJavaNIO {

	public static void main(String[] args) {

		System.out.println("Verificamos si el archivo existe");
		filesExists();

		System.out.println("Creamos un directorio");
		createDirectory();

		System.out.println("Hacemos una copia del archivo");
		copyFile();

		System.out.println("Movemos la copia del archivo");
		moveFile();

		System.out.println("Borramos el archivo original");
		deleteFile();
	}

	public static void filesExists() {
		// el metodo Files.exists() verifica si un path dado existe en el File System
		Path path = Paths.get("logging.properties");
		// LinkOption.NOFOLLOW_LINKS el metodo exists no debe buscar en links simbolicos
		// dentro
		// del fileSystem para determinar la existencia de un archivo
		boolean pathExist = Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
		if (pathExist) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("el archivo no Existe!");
		}
	}

	public static void createDirectory() {
		Path path = Paths.get("data"); // este es el directorio a crear
		try {
			Path newDir = Files.createDirectory(path); // aca se crear el directorio
		} catch (FileAlreadyExistsException e) {
			System.out.println("El directorio ya existia!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile() {
		Path sourcePath = Paths.get("logging.properties");
		Path destinationPath = Paths.get("logging-copy.properties");

		try {
			Files.copy(sourcePath, destinationPath);
			// si quisieramos sobreescribir el archivo existente en caso de que exista usa
			// la siguiente linea:
//			Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

		} catch (FileAlreadyExistsException e) {

			System.out.println("El directorio ya existia!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void moveFile() {
		Path sourcePath = Paths.get("logging-copy.properties");
		Path destinationPath = Paths.get("data/logging-moved.properties");

		try {
			Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void deleteFile() {
		Path path = Paths.get("logging.properties");
		try {
			Files.delete(path);
		} catch (IOException e) {
			System.out.println("No se logro borrar el archivo");
			e.printStackTrace();
		}
	}
}
