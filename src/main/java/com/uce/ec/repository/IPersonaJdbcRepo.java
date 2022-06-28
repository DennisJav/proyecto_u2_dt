package com.uce.ec.repository;

import com.uce.ec.to.Persona;

public interface IPersonaJdbcRepo {

	void crearPersona(Persona persona);
	Persona buscarPersonaCedula(int id);
	void eliminarPersona(int id);
	void actualizarPersona(Persona persona);
		
}
