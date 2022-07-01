package com.uce.ec.service;

import com.uce.ec.to.EstudianteTo;

public interface IEstudianteJdbcService {

	
	void crearEstudiante(EstudianteTo estudiante);
	EstudianteTo buscarEstudiante(int id);
	void eliminarEstudiante(int id);
	void actualizarEstudiante(EstudianteTo estudiante);
}
