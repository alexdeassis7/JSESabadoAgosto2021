package com.educacionit.programa;

import com.educacionit.errores.personalizados.MiPropiaException;
import com.educacionit.models.Persona;

public class AppPrincipal {

	public static void main(String[] args) {

		System.out.println("inicio de la app");

		Persona persona1 = new Persona(89826, "Gonzalo Dias");

		try {

			//persona1.metodoQuePuedeGenerarUnError(false);
			persona1.metodoQuePuedeGenerarUnError(true); //forzamos que el metodo genere un a exception

		} catch (MiPropiaException e) {
			e.printStackTrace();
			System.out.println("e.getMessage() :  ");
			System.out.println(e.getMessage());
		}

		System.out.println("Fin de la app");

	}

}
