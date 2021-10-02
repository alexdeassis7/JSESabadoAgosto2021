package com.educacionit.programa;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.educacionit.modelos.JugadorSeleccion;

public class AppPrincipal3 {

	public static void main(String[] args) {
		System.out.println("************************TREE MAP*********************");
		Map<String, JugadorSeleccion> treeMap = new TreeMap<String, JugadorSeleccion>();

		// insertamos elementos al map
		treeMap.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
		treeMap.put("Pique", new JugadorSeleccion(18, "Pique", "Central"));
		treeMap.put("Capdevila", new JugadorSeleccion(19, "Capdevila", "Central"));
		treeMap.put("Busquest", new JugadorSeleccion(16, "Busquest", "Central"));
		treeMap.put("Pedrito", new JugadorSeleccion(13, "Capdevilla", "Lateral Izquierdo"));
		treeMap.put("Villa", new JugadorSeleccion(14, "Villa", ""));
		treeMap.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
		treeMap.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
		treeMap.put("Xavi", new JugadorSeleccion(18, "Xavi Alonso", "Medio campo"));

		// imprimimos el map con un for each
		for (Entry<String, JugadorSeleccion> jugador : treeMap.entrySet()) {
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave + " --->>> " + valor.toString());
		}

	}

}
