package com.uce.ec.modelo.manytomany;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_sec_id")
	@SequenceGenerator(name = "libr_sec_id", sequenceName = "libr_sec_id", allocationSize = 1)
	private Integer id;
	@Column(name = "libr_titulo")
	private String titulo;
	@Column(name = "libr_paginas")
	private Integer cantidad_paginas;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor", joinColumns = @JoinColumn(name = "liau_id_libro"), inverseJoinColumns = @JoinColumn(name = "liau_id_autor"))
	private Set<Autor> autores;

	
	//set y get de la relacion
	
	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	
	//set y get
	
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

}
