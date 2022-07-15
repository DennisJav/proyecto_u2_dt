package com.uce.ec.repository;

import java.util.List;

import com.uce.ec.modelo.Estudiante;

public interface IEstudianteJpaRepo {

	void crearEstudiante(Estudiante estudiante);

	Estudiante buscarEstudiante(Integer id);

	Estudiante buscarEstudianteCedulaTyped(String cedula);

	Estudiante buscarEstudianteCedulaApellidoTyped(String cedula, String apellido);

	List<Estudiante> buscarEstudianteNombreApellidoNamed(String nombre, String apellido);

	List<Estudiante> buscarEstudianteFacultadNamed(String facultad);

	List<Estudiante> buscarEstudianteFacultadNombreApellidoNamedTyped(String facultad, String nombre, String apellido);

	Estudiante buscarEstudianteCedulaFacultadNamedTyped(String cedula, String facultad);
	
	
	Estudiante buscarCedulaApellidoNative(String cedula, String apellido);
	
	List<Estudiante> buscarApellidoFacultadNative(String apellido, String facultad);
	
	Estudiante buscarCedulaNamedNative(String cedula);

	List<Estudiante> buscarNombreApellidoNamedNative(String nombre, String apellido);
	

	void eliminarEstudiante(Integer id);

	void actualizarEstudiante(Estudiante estudiante);

}
