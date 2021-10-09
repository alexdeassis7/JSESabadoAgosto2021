package com.educacion.programa;

import javax.swing.JOptionPane;

import com.educacion.daos.PersonaDAO;
import com.educacion.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		// instanciamos un objeto dao para poder utilizar los procesos de accesos a la
		// base de datos
		PersonaDAO miDao = new PersonaDAO();
		int opcionIngresada = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Seleccione un opcion: \n 1)Registrar Persona\n 2)Buscar Persona \n 3)Actualizar Persona  \n 4)Borrar Persona"));

		switch (opcionIngresada) {
		case 1:
			// utilizamos el proceso que inserta una persona en la base de datos
			miDao.registrarPersona(SolicitarDatosDePersona(true));
			break;
		case 2:

			PersonaVO p2 = miDao.buscarPersona(solicitarId("buscar"));

			if (p2 != null) {
				JOptionPane.showMessageDialog(null, p2.toString());
			} else {
				JOptionPane.showMessageDialog(null, "La persona no existe ");
			}

			break;
			
		case 3:
			miDao.modificarPersona(SolicitarDatosDePersona(false));
			break;

		case 4:
			miDao.eliminarPersona(solicitarId("borrar"));
			break;

		default:
			JOptionPane.showMessageDialog(null, "La opcion " + opcionIngresada + " es invalida");
			break;
		}

	}

	public static int solicitarId(String frase) {
		// solicitamos los datos al user
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a " + frase + " en la base"));
	}

	// metodo utilizado para pedir los datos al user
	public static PersonaVO SolicitarDatosDePersona(boolean crearPersona) {

		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
		Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
		String profesion = JOptionPane.showInputDialog("Ingrese la profesion de la persona");
		Integer telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona"));

		if (!crearPersona) {
			// solicitamos los datos al user
			Integer id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona"));
			return new PersonaVO(id, nombre, edad, profesion, telefono);

		} else {
			return new PersonaVO(nombre, edad, profesion, telefono);
		}

	}
}
