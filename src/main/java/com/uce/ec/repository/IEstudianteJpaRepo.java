package com.uce.ec.repository;

import com.uce.ec.modelo.Estudiante;

public interface IEstudianteJpaRepo {

	void crearEstudiante(Estudiante estudiante);
	Estudiante buscarEstudiante(Integer id);
	void eliminarEstudiante(Integer id);
	void actualizarEstudiante(Estudiante estudiante);
	
}
