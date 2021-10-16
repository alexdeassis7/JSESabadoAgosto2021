package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Utilizamos archivos .properties");

		Principal miPrincipal = new Principal();
		miPrincipal.leerArchivo();

	}

	// leemos un archivo de propiedades desde una ruta espécifica y se imprime por
	// pantalla

	private void leerArchivo() {
		try {

//			creamos un objeto de tipo Properties
			Properties propiedades = new Properties();

			// cargamos el archivo desde la ruta especificada
			propiedades.load(new FileInputStream(
					"C:" + File.separator + "Users" + File.separator + "alexd" + File.separator + "Desktop"
							+ File.separator + "JSESabados" + File.separator + "Clase8ManejoProperties" + File.separator
							+ "src" + File.separator + "properties" + File.separator + "archivo.properties"));

		
//			 Obtenemos los parametros definidos en el archivo properties
			String baseDatos = propiedades.getProperty("basedatos");
			String usuario = propiedades.getProperty("usuario");
			String clave = propiedades.getProperty("clave");
			String ip = propiedades.getProperty("ip");

			/* Imprimimos los valores del archivo .properties */
			System.out.println("Estos son los datos recuperados del archivo");
			System.out.println("Key        value");
			System.out.println("usuario   " + usuario);
			System.out.println("baseDatos " + baseDatos);
			System.out.println("clave     " + clave);
			System.out.println("ip        " + ip);

		} catch (FileNotFoundException e) {
			System.out.println("Error , El archivo No exite");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error , No se puede leer el archivo");
			e.printStackTrace();
		}

	}
}
