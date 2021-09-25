	package com.educacionit.clase8.programa;
	
	import java.util.Iterator;

import com.educacionit.clase8.Bolsa;
	import com.educacionit.clase8.BolsaGenerica;
	import com.educacionit.clase8.Chocolatina;
	import com.educacionit.clase8.Golosina;
	import com.educacionit.clase8.excepciones.BolsaCompletaException;
	
	public class AppPrincipal {
	
		public static void main(String[] args) {
	
			// creamos una bolsa
			Bolsa bolsa = new Bolsa(3);
	
			// creamos chocolates y golosinas para llenar nuestra bolsa
			Chocolatina c = new Chocolatina("Milka");
			Chocolatina c1 = new Chocolatina("Ferrero");
			Chocolatina c2 = new Chocolatina("Cofler");
			Golosina g = new Golosina("Caramelos");
			Golosina g1 = new Golosina("chicle");
	
			try {
	
				// agregamos elementos a la bolsa
				bolsa.add(c);
				bolsa.add(c1);
				bolsa.add(c2);
				bolsa.add(g);
				bolsa.add(g1);
			} catch (BolsaCompletaException e) {
				System.out.println(e.getMessage());
			}
	
			// recorremos la bolsa para ver que tiene
			System.out.println("Elemento que contiene la bolsa NO GENERICA: ");
			for (Object o : bolsa) {
	
				if (o instanceof Chocolatina) {// chequamos que el objeto sea de tipo chocolatina
					Chocolatina chocolatina = (Chocolatina) o;// casteo el "Object" a una Chocolatina
					System.out.println(chocolatina.getMarca());
				} else {
					System.out.println(((Golosina) o).getNombre());
	
				}
	
			}
	
			// creamos una bolsa generica	
			BolsaGenerica<Golosina> bolsaGenerica = new BolsaGenerica<Golosina>(2);
			Golosina gg1 = new Golosina("GomitasMasticables");
			Golosina gg2 = new Golosina("Chupetin");
	
			try {
					//agregamos elemento a la bolsa generica , en este caso solo podran ser Golosinas
				bolsaGenerica.add(gg1);
				bolsaGenerica.add(gg2);
	
			} catch (BolsaCompletaException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Elemento que contiene la bolsa GENERICA: ");
			for(Golosina golosinaAux : bolsaGenerica) {
				System.out.println(golosinaAux.getNombre());
			}
	
		}
	
	}
