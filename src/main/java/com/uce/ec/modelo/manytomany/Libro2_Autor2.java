package com.uce.ec.modelo.manytomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2_autor2")
public class Libro2_Autor2 {
	
	@Id
	@Column(name = "aut2_lib2_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor2_lib2_sec_id")
	@SequenceGenerator(name = "autor2_lib2_sec_id", sequenceName = "autor2_lib2_sec_id", allocationSize = 1)
	private Integer id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "autor_id")
	private Autor2 autor2;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "libro_id")
	
	
	
	private Libro2 libro2;

	public Autor2 getAutor2() {
		return autor2;
	}

	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}

	public Libro2 getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}
	
	
	
	
	
}
