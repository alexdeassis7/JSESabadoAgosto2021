package com.educacionit.entidades;

import com.educacionit.interfaces.ImiInterfaceDos;
import com.educacionit.interfaces.ImiInterfaceUno;

public class TestSeudoHerenciaMultiple implements ImiInterfaceDos, ImiInterfaceUno{

	
	public void mostrarAtributoDeInterface() {
		System.out.println(CLAVE);
		System.out.println(CLAVE2);

		System.out.println(ImiInterfaceDos.USER);
		System.out.println(ImiInterfaceUno.USER);
		
	}
	@Override
	public void metodoA() {
		System.out.println("Soy el metodo A implementado");
		
	}

	@Override
	public void metodoUno() {
		System.out.println("Soy el metodo1 implementado");
		
		
	}

	@Override
	public void metodoDos() {
		System.out.println("Soy el metodo2 implementado");
		
	}
	
	public static void main(String[] args) {
		//probando mis interfaces
		TestSeudoHerenciaMultiple test = new TestSeudoHerenciaMultiple();
		
		test.metodoA();
		test.metodoUno();
		test.metodoDos();
		test.mostrarAtributoDeInterface();
	}

}
