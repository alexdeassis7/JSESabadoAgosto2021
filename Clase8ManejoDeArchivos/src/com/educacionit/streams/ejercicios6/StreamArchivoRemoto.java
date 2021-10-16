package com.educacionit.streams.ejercicios6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//import java.util.Properties;

public class StreamArchivoRemoto {

	public static void main(String[] args) {

		try {
			// si en la empresa tengo proxy utilizo estas lineas para setearlo
//			Properties systemSettings = System.getProperties();
//			systemSettings.put("proxySet", "true");
//			systemSettings.put("http.proxyHost","192.168.0.2");
//			systemSettings.put("http.proxyPort","80");

			// Construye un objeto URL
			URL url = new URL("https://raw.githubusercontent.com/alexdeassis7/JSESabadoAgosto2021/main/README.md");

			// Construimos un Stream contra la url remota
			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			// Variables
			boolean eof = false;
			String unaLinea;

			// Leemos el contenido del archivo remoto y los imprimimos por pantalla
			while (!eof) {
				// leo una linea
				unaLinea = elBuffer.readLine();

				// imprime la linea en pantalla
				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}

		} catch (MalformedURLException e) {
			System.out.println("La url no es valida !");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se pudo leer de internet el archivo  !");
			e.printStackTrace();
		}
	}

}
