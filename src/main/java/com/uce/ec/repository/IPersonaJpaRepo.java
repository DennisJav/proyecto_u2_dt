package com.uce.ec.repository;

import java.util.List;

import com.uce.ec.modelo.Persona;
import com.uce.ec.modelo.PersonaContadorGenero;
import com.uce.ec.modelo.PersonaSencilla;

public interface IPersonaJpaRepo {

	void crearPersona(Persona persona);

	Persona buscarPersonaCedula(Integer id);

	void eliminarPersona(Integer id);

	void actualizarPersona(Persona persona);

	Persona buscarCedula(String cedula);

	Persona buscarCedulaTyped(String cedula);

	Persona buscarCedulaNamed(String cedula);

	Persona buscarCedulaTypedNamed(String cedula);

	List<Persona> buscarNombreApellido(String nombre, String apellido);

	List<Persona> buscarApellido(String apellido);

	List<Persona> buscarGenero(String genero);

	List<Persona> buscarNombre(String nombre);

	Persona buscarCedulaNative(String cedula);

	Persona buscarCedulaNamedNative(String cedula);
	
	Persona buscarCedulaCriteriaAPI(String cedula);
	
	Persona buscarDinamicamenteCriteriaAPI(String nombre, String apellido, String genero);
	
	int actualizarPorApellido(String genero, String apellido);

	int eliminarPorGenero(String genero);
	
	List<PersonaSencilla> buscarPorApellidoSencillo(String apellido);
	
	List<PersonaContadorGenero> consultarCantidadPorGenero();
}
