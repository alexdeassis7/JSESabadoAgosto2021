package com.educacionit.interfaces;

//Interface : es una clase Abstracta Pura ,

//es un conjunto de metodos abstractos y atributo constantes

//todos los metodos de una interface sean o no default son Implicitamente public
//todos los atributo son CONSTANTES! 
public interface IntegranteSeleccionFutbol {

	// conjunto de metodo abstractos
	void concentrarse();

	void viajar();

	void entrenar();

	void jugarPartido();

	// a partir de java 8 , podemos tener metodos "default"

	// nos permite de manera flexible modificar el patròn de abstracciòn que hasta
	// ahora las interfaces proporcionaban
	// podremos editar el comportamiento del metodo default desde la interface y
	// automaticamente propagarlo a todas las
	// clase que implementen sin tener que andar editando una por una
//	default void metodoDefault() {
//		System.out.println("Hola soy un metodo implementado en la Interface java 8 o superior , pero nadie nunca me utiliza");
//	}

	//CON LAS INTERFACES DE JAVA 8 PODEMOS TENER HERENCIA MULTIPLE APLICADA EXCLUSIVAMENTE A METODOS , PERO NO A ATRIBUTOS 

	default void ruedaPrensa() {
		System.out.println("da una conferencia de prensa (metodo desde la interface)");
	}

	default void videoPublicitario() {
		System.out.println("hace un video publicitario en busca de canje (metodo desde la interface)");
	}
}
