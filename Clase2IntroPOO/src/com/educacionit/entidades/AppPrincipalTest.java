package com.educacionit.entidades;

public class AppPrincipalTest {

	public static void main(String[] args) {
		// Instanciamos objetos del Tipo "Auto" , mediante la invocacion al metodo constructor Vacio
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		Auto a3 = new Auto();
		
		byte puertas = 3 ;
		Auto a4 = new Auto("verde" ,"320" , "bmw" , 50 ,78 , puertas);
		Auto a5 = new Auto("rosa" ,"fuego" , "renault" , 40 ,80 , puertas);
		Auto a6 = new Auto("corolla" , "toyota" , 40 ,80 , puertas);
		
		
		// chequeamos el estado de los atributos del objeto a1
		System.out.println("*********************** Estados de atributos de objeto a1 **********");
		System.out.println(a1.toString());// invocamos al metodo to String para conocer el estados del objeto
		
		// chequeamos el estado de los atributos del objeto a2
		System.out.println("*********************** Estados de atributos de objeto a2 **********");
		System.out.println(a2.toString());// invocamos al metodo to String para conocer el estados del objeto

		System.out.println("*********************** Estados de atributos de objeto a3 **********");
		// chequeamos el estado de los atributos del objeto a3
		System.out.println(a3.toString());// invocamos al metodo to String para conocer el estados del objeto

		System.out.println("*********************** Estados de atributos de objeto a4 **********");
		// chequeamos el estado de los atributos del objeto a3
		System.out.println(a4.toString());// invocamos al metodo to String para conocer el estados del objeto

		System.out.println("*********************** Estados de atributos de objeto a5 **********");
		// chequeamos el estado de los atributos del objeto a3
		System.out.println(a5.toString());// invocamos al metodo to String para conocer el estados del objeto

		System.out.println("*********************** Estados de atributos de objeto a6 **********");
		// chequeamos el estado de los atributos del objeto a3
		System.out.println(a6.toString());// invocamos al metodo to String para conocer el estados del objeto

		
		
		
		// modificamos el estado de los atributos del objeto a1
		a1.color = "negro";
		a1.modelo = "325i";
		a1.marca = "bmw";
		a1.capacidaMaxDeCombustible = 50;
		a1.puertas = 3;
		// modificamos el estado de los atributos del objeto a1
		a2.color = "rojo";
		a2.modelo = "a6";
		a2.marca = "audi";
		a2.capacidaMaxDeCombustible = 75;
		a2.puertas = 4;
		// modificamos el estado de los atributos del objeto a1
		a3.color = "blanco";
		a3.modelo = "Grand Cheroke";
		a3.marca = "jeep";
		a3.capacidaMaxDeCombustible = 100;
		a3.puertas = 5;

		// chequeamos el estado de los atributos del objeto a1
		System.out.println("*********************** Estados de atributos de objeto a1 **********");
		System.out.println(a1.toString());// invocamos al metodo to String para conocer el estados del objeto
		// chequeamos el estado de los atributos del objeto a2
		System.out.println("*********************** Estados de atributos de objeto a2 **********");

		System.out.println(a2.toString());// invocamos al metodo to String para conocer el estados del objeto
		System.out.println("*********************** Estados de atributos de objeto a3 **********");
		// chequeamos el estado de los atributos del objeto a3
		System.out.println(a3.toString());// invocamos al metodo to String para conocer el estados del objeto
		// identado de codigo :ctrl + shift + f

		
	
		System.out.println("---------------------------------------------Test Metodos de la clase Auto-------------------------------");
		System.out.println("-------------------------------Test A1-----");
		System.out.println(a1.cargarCombustible(30));
		System.out.println(a1.cargarCombustible(70));
		a1.acelerar(150);
		a1.frenar();
		System.out.println(a1.toString());
		
		System.out.println("-------------------------------Test A2-----");
		System.out.println(a2.cargarCombustible(30));
		System.out.println(a2.cargarCombustible(45));
		a2.acelerar(180);
		a2.frenar();
		System.out.println(a2.toString());
		
		System.out.println("-------------------------------Test A3-----");
		System.out.println(a3.cargarCombustible(30));
		System.out.println(a3.cargarCombustible(70));

		System.out.println(a3.cargarCombustible(70));
		//demo sobrecarga de metodos
		a3.acelerar(210);
		a3.acelerar();
		a3.acelerar(" Av Santa Fe.");
		
		
		
		a3.frenar();
		System.out.println(a3.toString());
		
		
	}

}
