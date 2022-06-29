package com.uce.ec.to;


public class PersonaTo {

	private int id;
	private String nombre;
	private String apellido;
	
	
	
	//Constructor por defecto, va siempre que use un constructor con sus fields o diferente al por defecto
	public PersonaTo() {
	
	}

	//Constructor con todos los atributos para el metodo de Buscar con JDBC
	public PersonaTo(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//set y get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
