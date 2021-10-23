package com.educacionit.models;

public class PersonaVO {

	private String idname;
	private int password;

	public PersonaVO() {
	}

	public PersonaVO(String idname, int password) {
		this.idname = idname;
		this.password = password;
	}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
