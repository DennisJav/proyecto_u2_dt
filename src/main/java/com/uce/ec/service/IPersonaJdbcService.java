package com.uce.ec.service;

import java.util.List;

import com.uce.ec.to.PersonaTo;

public interface IPersonaJdbcService {
	List<PersonaTo> buscarTodos();
	void crearPersona(PersonaTo persona);
	PersonaTo buscarPersonaCedula(int id);
	void eliminarPersona(int id);
	void actualizarPersona(PersonaTo persona);
}
