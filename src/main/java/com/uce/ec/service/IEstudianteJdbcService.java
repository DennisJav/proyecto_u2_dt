package com.uce.ec.service;

import com.uce.ec.to.Estudiante;

public interface IEstudianteJdbcService {

	
	void crearEstudiante(Estudiante estudiante);
	Estudiante buscarEstudiante(int id);
	void eliminarEstudiante(int id);
	void actualizarEstudiante(Estudiante estudiante);
}
