package com.uce.ec.service;

import com.uce.ec.modelo.Persona;

public interface IPersonaJpaService {

	void crearPersona(Persona persona);
	Persona buscarPersonaCedula(Integer id);
	void eliminarPersona(Integer id);
	void actualizarPersona(Persona persona);
}
