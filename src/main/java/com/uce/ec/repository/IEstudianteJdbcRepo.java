package com.uce.ec.repository;

import com.uce.ec.to.Estudiante;

public interface IEstudianteJdbcRepo {

	void crearEstudiante(Estudiante estudiante);
	Estudiante buscarEstudiante(int id);
	void eliminarEstudiante(int id);
	void actualizarEstudiante(Estudiante estudiante);
	
}
