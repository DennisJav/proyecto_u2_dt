package com.uce.ec.modelo.manytomany;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

	
	@Id
	@Column(name = "aut_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_sec_id")
	@SequenceGenerator(name = "autor_sec_id", sequenceName = "autor_sec_id", allocationSize = 1)
	private Integer id;
	@Column(name = "aut_nombre")
	private String nombre;
	
	@ManyToMany(mappedBy = "autores")
	private Set<Libro> libros;
	
	
	
	//set y get de la relacion
	
	public Set<Libro> getLibros() {
		return libros;
	}
	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	
	//set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
}
