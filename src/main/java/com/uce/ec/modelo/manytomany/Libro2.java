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
@Table(name = "libro2")
public class Libro2 {
	@Id
	@Column(name = "libr2_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr2_sec_id")
	@SequenceGenerator(name = "libr2_sec_id", sequenceName = "libr2_sec_id", allocationSize = 1)
	private Integer id;
	@Column(name = "libr2_titulo")
	private String titulo;
	@Column(name = "libr2_paginas")
	private Integer cantidad_paginas;
	
	
	@OneToMany(mappedBy = "libro2",cascade = CascadeType.ALL)
	private List<Libro2_Autor2> libro2_autor2;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Integer getCantidad_paginas() {
		return cantidad_paginas;
	}


	public void setCantidad_paginas(Integer cantidad_paginas) {
		this.cantidad_paginas = cantidad_paginas;
	}


	public List<Libro2_Autor2> getLibro2_autor2() {
		return libro2_autor2;
	}


	public void setLibro2_autor2(List<Libro2_Autor2> libro2_autor2) {
		this.libro2_autor2 = libro2_autor2;
	}
	
	
	
	
}
