package com.example.demo.model;

public class Credenciales {
	
	private String nombre;
	private String pass;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Credenciales(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}
	public Credenciales() {}
	
}
