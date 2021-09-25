package com.educacionit.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



//CUANDO UTILIZAR UN SET ??  cuando no queremos tener elementos repetidos 

public class AppDemoTieposDelSet {

	public static void main(String[] args) {
		// ---------------------------Implementacion HASH SET ---------
		final Set hashSet = new HashSet(1_000_000);

		// capturo el tiempo antes de iniciar la carga del Set
		final Long startHashSetTime = System.currentTimeMillis();

		// agregamos un millon de elementos enteros al HashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		// capturo el tiempo al finalizar la carga del Set
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del Hash Set: " + (endHashSetTime - startHashSetTime));

		// ---------------------------Implementacion TREE SET ---------
		final Set treeSet = new TreeSet();

		// capturo el tiempo antes de iniciar la carga del Set
		final Long startTreeSetTime = System.currentTimeMillis();

		// agregamos un millon de elementos enteros al TreeSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		// capturo el tiempo al finalizar la carga del Set
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del Tree Set: " + (endTreeSetTime - startTreeSetTime));

		// ---------------------------Implementacion Linked HASH SET ---------
		final Set linkedHashSet = new LinkedHashSet();

		// capturo el tiempo antes de iniciar la carga del Set
		final Long startLinkedHashSetTime = System.currentTimeMillis();

		// agregamos un millon de elementos enteros al TreeSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		// capturo el tiempo al finalizar la carga del Set
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del LinkedHash Set: " + (endLinkedHashSetTime - startLinkedHashSetTime));

		
		
		//Ninguna de estas 3 implementaciones son sincronizadas , es decir , no se garantiza el estado del Set si dos o màs
		//Hilos de ejecucion acceden de forma concurrente al set , pero afortunadamente esto se puede 
		//solucionar empleando una serie de mètodos que actuan de wrapper para dotar a estas colleciones de esa
		//falta de sincronizacion ejemplo :
	     Set hashSetSincronizado = Collections.synchronizedSet(new HashSet(1_000_000));
		 Set treeSetSincronizado = Collections.synchronizedSortedSet( new TreeSet());
		 Set linkedHashSetSincronizado = Collections.synchronizedSet(new LinkedHashSet());
		
		
		
		
	}

}
