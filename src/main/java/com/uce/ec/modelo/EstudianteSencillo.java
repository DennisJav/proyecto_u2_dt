package com.uce.ec.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String facultad;
	
	
	
	public EstudianteSencillo() {

	}



	public EstudianteSencillo(String nombre, String apellido, String facultad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.facultad = facultad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getFacultad() {
		return facultad;
	}



	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}



	@Override
	public String toString() {
		return "EstudianteSencillo [nombre=" + nombre + ", apellido=" + apellido + ", facultad=" + facultad + "]";
	}
	
	
	
}
