package com.educacionit.entidadesdos;

public class AppPrincipalDos {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		//p1.apellido= "de assis"; no podemos acceder a un atributo private 
		System.out.println(p1.toString());

		//p1.edad = -89;

		System.out.println(p1.toString());
		// utilizamos get & set
		
		System.out.println("p1.getEdad(): "+ p1.getEdad());;

		System.out.println("modificamos el estado de los atributos mediante sus setters");
		byte edadASetear = -25 ;
		p1.setEdad(edadASetear);
		p1.setAltura(1.78f);
		p1.setApellido("Martinez");
		p1.setNombre("Mariano");
		p1.setSexo('M');
		
		System.out.println("accedemos a los estados de los atributos mediante sus Getters");
		System.out.println("p1.getEdad(): "+ p1.getEdad());;
		System.out.println("p1.getAltura(): "+ p1.getAltura());;
		System.out.println("p1.getApellido(): "+ p1.getApellido());;
		System.out.println("p1.getNombre(): "+ p1.getNombre());;
		System.out.println("p1.getSexo(): "+ p1.getSexo());;
		
		
	}
}
