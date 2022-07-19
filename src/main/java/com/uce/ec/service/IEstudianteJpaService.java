package com.uce.ec.service;

import java.util.List;

import com.uce.ec.modelo.Estudiante;
import com.uce.ec.modelo.EstudianteFacultadCont;
import com.uce.ec.modelo.EstudianteSencillo;

public interface IEstudianteJpaService {

	void crearEstudiante(Estudiante estudiante);

	Estudiante buscarEstudiante(Integer id);

	void eliminarEstudiante(Integer id);

	void actualizarEstudiante(Estudiante estudiante);

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

	Estudiante buscarEstudianteCriteriaApi(String cedula, String nombre);

	List<Estudiante> buscarEstudianteListaCriteriaApi(String apellido, String facultad);

	List<EstudianteSencillo> consultarCarreraSencilla(String facultad);

	List<EstudianteFacultadCont> consultarFacultadContadorCont();

}
