package com.uce.ec.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_id_pasa")
	@SequenceGenerator(name = "sec_id_pasa", sequenceName = "sec_id_pasa", allocationSize = 1)
	@Column(name = "pasa_id")
	private Integer id;
	@Column(name = "pasa_numero")
	private String numero;
	@Column(name = "pasa_fecha_emision")
	private LocalDateTime fechaEmision;
	@Column(name = "pasa_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pasa_id_ciudadano")
	private Ciudadano ciudadano;//este nombre es el que debe ir en el mapped by <------------- CUIDADO CON ESE NOMBRE // relacion Bidireccional


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}


	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public Ciudadano getCiudadano() {
		return ciudadano;
	}


	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}


	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad +"]";
	}
	
	
	
	
	
}
