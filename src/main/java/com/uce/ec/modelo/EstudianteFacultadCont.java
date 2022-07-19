package com.uce.ec.modelo;

import java.io.Serializable;

public class EstudianteFacultadCont implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String facultad;
	private long cantidad;
	
	
	
	public EstudianteFacultadCont() {

	}



	public EstudianteFacultadCont(String facultad, long cantidad) {
		super();
		this.facultad = facultad;
		this.cantidad = cantidad;
	}



	public String getFacultad() {
		return facultad;
	}



	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}



	public long getCantidad() {
		return cantidad;
	}



	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "EstudianteFacultadCont [facultad=" + facultad + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
