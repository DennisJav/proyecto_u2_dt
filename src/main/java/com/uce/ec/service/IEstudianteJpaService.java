package com.uce.ec.service;


import com.uce.ec.modelo.Estudiante;

public interface IEstudianteJpaService {

	void crearEstudiante(Estudiante estudiante);
	Estudiante buscarEstudiante(Integer id);
	void eliminarEstudiante(Integer id);
	void actualizarEstudiante(Estudiante estudiante);
}
