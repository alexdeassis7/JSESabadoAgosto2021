package com.educacionit;

//ejemplo interface funcional para una EXPRESION LAMBDA CON UNO O MAS PARAMETROS :

//@FunctionalInterface

public interface MiValorParam {
//si la exopresion lambda toma uno o mas parametros , entonces el metodo abstracto en la interface
	//funcional tambien debe tomar el miemo numeor de parametros 
	
	//aqui tenemos una interface funcional llamada MiValorParam , que nos permite pasarle 
	//un valor al metodo getValor();
	double  getValor(double v);

}
