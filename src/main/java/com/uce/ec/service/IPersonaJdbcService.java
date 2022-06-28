package com.uce.ec.service;

import com.uce.ec.to.Persona;

public interface IPersonaJdbcService {
	void crearPersona(Persona persona);
	Persona buscarPersonaCedula(int id);
	void eliminarPersona(int id);
	void actualizarPersona(Persona persona);
}
