package com.educacionit.entidades;

//clase hija de SeleccionFutbol
public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	// metodo propio de la clase hija
	public void jugarPartido() {
		System.out.println("jugarPartido() - Clase Hija Futbolista");
	}

	// metodo propio de la clase hija
	public void entrenar() {
		System.out.println("entrenar() - Clase Hija Futbolista");
	}

	public Futbolista() {
		// llamo al constructo vacio de la clase padre
		super();// super me sirve para llamar al constructor de la clase
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		// llamo al constructor con parametros de la clase padre
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("REaliza un Entrenamiento (Clase Futbolista)");
	}
	
	//especializacion : sobreescribo un metodo de la clase padre
	@Override
	public void partidoFutbol() {
		System.out.println("Juega un partido  (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da un Entrevista (Clase Futbolista)");
	}
}
