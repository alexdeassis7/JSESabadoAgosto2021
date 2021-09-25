package com.educacionit.clase8.excepciones;

public class BolsaCompletaException extends Exception {
	String mensaje;

	public BolsaCompletaException(String mensaje_a_mostrar) {
		this.mensaje = mensaje_a_mostrar;
	}

	// redefinimos el metodo getMessade()
	@Override
	public String getMessage() {
		return "No caben mas  " + mensaje + " en la bolsa!";
	}
}
