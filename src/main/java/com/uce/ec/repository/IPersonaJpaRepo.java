package com.uce.ec.repository;

import java.util.List;

import com.uce.ec.modelo.Persona;

public interface IPersonaJpaRepo {

	
	void crearPersona(Persona persona);
	Persona buscarPersonaCedula(Integer id);
	void eliminarPersona(Integer id);
	void actualizarPersona(Persona persona);
	Persona buscarCedula(String cedula);
	List<Persona> buscarApellido(String apellido);
	List<Persona> buscarGenero(String genero);
	List<Persona> buscarNombre(String nombre);
	int actualizarPorApellido(String genero, String apellido);
	int eliminarPorGenero(String genero);
}
