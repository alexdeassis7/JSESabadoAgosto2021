package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.clase8.excepciones.BolsaCompletaException;

//Bolsa : clase NO GENERICA
//implemento la interface iterable para que la bolsa sea un elemento "recorrible" y ais poder utilizar el foreach
public class Bolsa implements Iterable {

	private ArrayList lista = new ArrayList();
	private int tope;

	// metodo que permite instancaia una bolsa definiendo el tope de la misma
	public Bolsa(int tope) {
		this.tope = tope;
	}

	// metodo que permite agregar objetos a una bolsa siempre y cuando no este llena
	public void add(Object objeto) throws BolsaCompletaException {

		if (lista.size() < tope) { // chequeamos que la bolsa ya no este llena
			lista.add(objeto);// agregamos el objeto a la bolsa
			System.out.println("Se Agrego el objeto a la bolsa");
		} else {

			 throw new BolsaCompletaException(" Cosas ");//recordar agregar throws
			//throw new RuntimeException("No Caben Mas elementos");
		}

	}

	@Override
	public Iterator iterator() {
		return lista.iterator();
	}

}
