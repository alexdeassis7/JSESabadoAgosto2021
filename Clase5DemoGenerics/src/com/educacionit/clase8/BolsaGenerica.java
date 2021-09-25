package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.clase8.excepciones.BolsaCompletaException;

public class BolsaGenerica<T> implements Iterable<T> {

	private ArrayList lista = new ArrayList();
	private int tope;

	public BolsaGenerica(int tope) {
		this.tope = tope;
	}

	public void add(T objeto) throws BolsaCompletaException {
		if (lista.size() < tope) { // chequeamos que la bolsa ya no este llena
			lista.add(objeto);// agregamos el objeto a la bolsa
			System.out.println("Se Agrego el objeto a la bolsa");
		} else {

			throw new BolsaCompletaException(" Cosas ");// recordar agregar throws
			// throw new RuntimeException("No Caben Mas elementos");
		}
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
}
