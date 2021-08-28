package com.educacionit.entidades;

public class Direccion {

	// atributos de la clase
	private String calle;
	private int altura;
	private int codigoPostal;
	private String provincia;
	private String pais;

	public Direccion() {
	}

	public Direccion(String calle, int altura, int codigoPostal, String provincia, String pais) {
		this.calle = calle;
		this.altura = altura;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", codigoPostal=" + codigoPostal + ", provincia="
				+ provincia + ", pais=" + pais + "]";
	}

}
