package com.educacionit.programa;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AppPrincipla2 {
	public static void main(String[] args) {
		System.out.println("************************TREE MAP*********************");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		// insertamos elementos al map
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

		// imprimimos el map con un iterator
		// nos muestra en un orden natural
		Iterator it2 = treeMap.keySet().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Clave : " + key + " -->> Valor: " + treeMap.get(key));
		}

		System.out.println("----------------Trabajando con los metodos de Map----------------");
		System.out.println("Mostramos es numero de elementos del treeMap : " + treeMap.size());
		System.out.println("Vemos si el treemap esta vacio : " + treeMap.isEmpty());
		System.out.println("Obtenemos un elemento del map pasandole la clave 6 : " + treeMap.get(6));
		System.out.println("Borramos un elemento del map el 18 :" + treeMap.remove(18));
		System.out.println("vemos que pasa si queremos obtener la clave 18 que ya no existe :" + treeMap.get(18));
		System.out.println("vemos si existe un elemento con la clave 18 :" + treeMap.containsKey(18));
		System.out.println("vemos si existe un elemento con la clave 1 :" + treeMap.containsKey(1));
		System.out.println("vemos si existe el valor 'Villa' en el map :" + treeMap.containsValue("Villa"));
		System.out.println("vemos si existe el valor 'Gustavo' en el map :" + treeMap.containsValue("Gustavo"));
		System.out.println("Borramos todos los elementos de un map ");
		treeMap.clear();

		System.out.println("comprobamos si lo hemos vaciado al map viendo su tamaño :" + treeMap.size());
		System.out.println("lo comprobamos tambien viendo si esta vacio :" + treeMap.isEmpty());

	}
}
