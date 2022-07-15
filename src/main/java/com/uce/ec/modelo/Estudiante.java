package com.uce.ec.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarNombreApellidoNamed", query = "select e from Estudiante e where e.nombre = :valoruno AND e.apellido = :valordos")
@NamedQuery(name = "Estudiante.buscarFacultadNamed", query = "select e from Estudiante e where e.facultad = :valoruno")
@NamedQuery(name = "Estudiante.buscarFacultadNombreApellidoTypedNamed", query = "select e from Estudiante e where e.facultad = :valoruno AND e.nombre = :valordos AND e.apellido = :valor")
@NamedQuery(name = "Estudiante.buscarCedulaFacultadTypedNamed", query = "select e from Estudiante e where e.cedula = :valoruno AND e.facultad = :valordos")

@NamedNativeQuery(name = "Estudiante.buscarPorCedulaNativeNamed", query = "select * from estudiante where cedula =:valoruno",resultClass = Estudiante.class)
@NamedNativeQuery(name = "Estudiante.buscarPorNombreApellidoNativeNamed", query = "select * from estudiante where nombre =:valoruno AND apellido =:valordos",resultClass = Estudiante.class)

public class Estudiante {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_id_estu")
	@SequenceGenerator(name = "sec_id_estu", sequenceName = "sec_id_estu", allocationSize = 1)
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "facultad")
	private String facultad;

	// set y get
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", facultad=" + facultad + "]";
	}

}
