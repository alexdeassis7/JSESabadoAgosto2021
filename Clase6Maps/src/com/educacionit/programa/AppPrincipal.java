package com.educacionit.programa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppPrincipal {

	public static void main(String[] args) {
		// declaracion de un Map (HashMap ) con clave Integer dy valor String
		// la claves pueden ser de cualquier tipo de objetos , aunque los mas utilizados
		// como clave
		// en java son los objetos predefinidos (String, Integer , Float ,Double) , OJO
		// no pueden ser datos primitivos
		// key = clave , value = valor

		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		// la implementaciones mas utilizadas de los map son :

		// Hash map :
		// los elementos insertados no tienen un orden especifico , no acepta clave
		// duplicadas ni valores nulos

		// TreeMap :
		// los elementos se ordenan de forma natural , por ejemplo si la clave son
		// enteros los ordena de menor a mayor

		// LinkedHashMap :
		// inserta en el map los elementos en el orden que se agregaron ,las busquedas
		// en esta implementacion
		// son menos performantes

		// devuelve el numero de elementos que tiene el map
		System.out.println("size()" + nombreMap.size());
		// Devuelve true si no hay elementos en el Map y false si los hay
		System.out.println("isEmpty()" + nombreMap.isEmpty());
		// añade un elemento al map
		// nombreMap.put(key, value);
		System.out.println(nombreMap.put(1, "alex"));
		// devuelve el valor de la clave que le se ´para comoparametro o null si la
		// clave no existe
		System.out.println(nombreMap.get(1));
		//// borra todo los elementos del mapa
		System.out.println("se vacio todo el map");
		// nombreMap.clear();
		// borra el par clave / valor de la clave que se le envia por parametro
		// System.out.println(nombreMap.remove(1));
		// devuelve true si dentro del map hay una clave que coincide con el parametro
		// enviado
		System.out.println(nombreMap.containsKey(1));
		// devuelve treu si en el map hay un Valor que conincide con el parametro
		// enviado
		System.out.println(nombreMap.containsValue("alex"));
		// devuelve una Collection con los valores del map
		System.out.println(nombreMap.values());

		System.out.println("************************HASH MAP*********************");
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//insertamos elementos al map
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevila");
		map.put(16, "Busquest");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xavi Alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "Iniesta");
		
		//imprimimos el map con un iterator
		//este no mostrara los elementos sin un "orden Lógico"
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave : " + key + " -->> Valor: " + map.get(key));
		}

		System.out.println("************************Linked Hash MAP*********************");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		//insertamos elementos al map
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(16, "Busquest");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xavi Alonso");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(6, "Iniesta");
		
		//imprimimos el map con un iterator
		//nos muestra con un orden de insercion
		Iterator it3 = linkedHashMap.keySet().iterator();
		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println("Clave : " + key + " -->> Valor: " + linkedHashMap.get(key));
		}

		System.out.println("************************TREE MAP*********************");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//insertamos elementos al map
		treeMap.put(1, "Casillas");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevila");
		treeMap.put(16, "Busquest");
		treeMap.put(18, "Pedrito");
		treeMap.put(7, "Villa");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(14, "Xavi Alonso");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(6, "Iniesta");
		
		//imprimimos el map con un iterator
		//
		Iterator it2 = treeMap.keySet().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Clave : " + key + " -->> Valor: " + treeMap.get(key));
		}

	}

}
