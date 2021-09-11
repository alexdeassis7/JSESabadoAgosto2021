package com.educacionit.entidades;

//clase hija de SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;// atributo propio de la clase hija

	public void dirigirPartido() {
		System.out.println("dirigirPartido() - Clase Hija Entrenador ");
	}

	public void dirigirEntrenamiento() {
		System.out.println("dirigirEntrenamiento() - Clase Hija Entrenador ");
	}

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("Planifica un entrenamiento - (Clase Entrenador)");
	}

	// sobreescribimos metodo de la clase padre
	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un partido de Futbol -  (Clase Entrenador) ");
	}

	//metodo propio de la clase hija 
	public void planificarEntrenamiento() {
		System.out.println("Planifica un Entrenamiento -  (Clase Entrenador) ");
	}

	@Override
	public void entrenar() {
		System.out.println("dirige el entrenamiento (Clase Entrenador) ");
		
	}

	@Override
	public void jugarPartido() {
				System.out.println("dirige un Partido (Clase Entrenador )");
	}

}
