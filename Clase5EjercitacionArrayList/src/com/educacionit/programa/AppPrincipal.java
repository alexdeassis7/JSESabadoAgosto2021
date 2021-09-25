package com.educacionit.programa;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.modelos.Banco;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		// instanciamos 6 personas para sumarlas a la fila del banco
		Persona p = new Persona("Alejandro", "Suarez", "12345");
		Persona p1 = new Persona("Gustavo", "Lezcano", "55555");
		Persona p2 = new Persona("Hugo", "Romero", "66666");
		Persona p3 = new Persona("Jose", "Vetancourt", "77777");
		Persona p4 = new Persona("Martin", "Alderete", "88888");
		Persona p5 = new Persona("Alex", "De Assis", "9999");
		Persona p6 = new Persona("Alex1111", "De Assis1111", "9912399");
		Persona p7 = new Persona("Alex123", "De Assis123", "999129");
		Persona p8 = new Persona("Alex123", "De Assis123", "999129");

		// creamos el banco y agragamos las personas al mismo
		Banco b1 = new Banco();
		b1.agregarPersona(p);
		b1.agregarPersona(p1);
		b1.agregarPersona(p2);
		b1.agregarPersona(p3);
		b1.agregarPersona(p4);
		b1.agregarPersona(p5);
		b1.agregarPersona(p6);
		b1.agregarPersona(p7);
		b1.agregarPersona(p8);// este dato no se agrega por ser dni repetido

		System.out.println("Cantidad de Personas en la fila : " + b1.cuantasPersonasHay());

		b1.mostrarLaFila();

		b1.eliminarPersonaDeFila(p1);
		b1.eliminarPersonaDeFila(p1);

		System.out.println("Cantidad de Personas en la fila : " + b1.cuantasPersonasHay());

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------");

		ArrayList<String> nombreArrayList = new ArrayList<>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento2");
		nombreArrayList.add("Elemento3");

		System.out.println("cantidad de elementos : " + nombreArrayList.size());
		System.out.println("Elemento de la posicion 2 :" + nombreArrayList.get(2));
		System.out.println("Contiene a 'Elemento6' ??? " + nombreArrayList.contains("Elemento6"));
		System.out.println(nombreArrayList);

		// borramos todos los elemenos de un arrayList
		// nombreArrayList.clear();
		// System.out.println("Se borraron todos los elementos ");
		// System.out.println(nombreArrayList);

		// Comvertimos un arrayList a un array
		Object[] array = nombreArrayList.toArray();

		ArrayList<String> miArray = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			miArray.add("Elemento " + i);
		}
		System.out.println(miArray);

		// Declaramos Iterador e imprimimos los elementos del ArrayList
		Iterator<String> nombreIterator = miArray.iterator();
		System.out.println(miArray);

		while (nombreIterator.hasNext()) {// recorro el iterator mientras queden elementos
			String elemento = nombreIterator.next(); // obtengo el siguiente elemento del iterator
			if (elemento.equals("Elemento 3")) {
				nombreIterator.remove();// removemos el elemento con el remove del iterator
			}
		}
		System.out.println(miArray);
	}

}
