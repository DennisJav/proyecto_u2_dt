package com.uce.ec.modelo.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor2")
public class Autor2 {
	@Id
	@Column(name = "aut2_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor2_sec_id")
	@SequenceGenerator(name = "autor2_sec_id", sequenceName = "autor2_sec_id", allocationSize = 1)
	private Integer id;
	@Column(name = "aut2_nombre")
	private String nombre;
	
	
	@OneToMany(mappedBy = "autor2",cascade = CascadeType.ALL)
	private List<Libro2_Autor2> libro2_autor2;


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


	public List<Libro2_Autor2> getLibro2_autor2() {
		return libro2_autor2;
	}


	public void setLibro2_autor2(List<Libro2_Autor2> libro2_autor2) {
		this.libro2_autor2 = libro2_autor2;
	}

	


	
	
	
	
}
