package com.educacionit.errores.personalizados;

//para crear una exception personalizada es necesario extender de la clase Exception

public class MiPropiaException extends Exception {

	String mensaje;

	public MiPropiaException(String mensaje_a_mostrar) {
		this.mensaje = mensaje_a_mostrar;
	}

	// redefinimos el metodo getMessade()
	@Override
	public String getMessage() {
		return mensaje + " => Soy un mensaje de error customizado ( sobreescritura de metodo de la clase padre) ";
	}
}
