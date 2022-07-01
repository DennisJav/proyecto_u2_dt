package com.uce.ec.repository;

import com.uce.ec.to.EstudianteTo;

public interface IEstudianteJdbcRepo {

	void crearEstudiante(EstudianteTo estudiante);
	EstudianteTo buscarEstudiante(int id);
	void eliminarEstudiante(int id);
	void actualizarEstudiante(EstudianteTo estudiante);
	
}
