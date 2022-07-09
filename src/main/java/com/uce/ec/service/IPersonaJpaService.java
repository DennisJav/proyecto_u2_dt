package com.uce.ec.service;

import java.util.List;

import com.uce.ec.modelo.Persona;

public interface IPersonaJpaService {

	void crearPersona(Persona persona);
	Persona buscarPersona(Integer id);
	void eliminarPersona(Integer id);
	void actualizarPersona(Persona persona);
	Persona buscarCedula(String cedula);
	List<Persona> buscarApellido(String apellido);
	int actualizarPorApellido(String genero, String apellido);
	int eliminarPorGenero(String genero);
}
