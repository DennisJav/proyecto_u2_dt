package com.uce.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Estudiante;
import com.uce.ec.repository.IEstudianteJpaRepo;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{

	@Autowired
	private IEstudianteJpaRepo estudianteJpaRepo;
	
	@Override
	public void crearEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepo.crearEstudiante(estudiante);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudiante(id);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepo.eliminarEstudiante(id);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJpaRepo.actualizarEstudiante(estudiante);
	}

	@Override
	public Estudiante buscarEstudianteCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteCedulaTyped(cedula);
	}

	@Override
	public Estudiante buscarEstudianteCedulaApellidoTyped(String cedula, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteCedulaApellidoTyped(cedula, apellido);
	}

	@Override
	public List<Estudiante> buscarEstudianteNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteNombreApellidoNamed(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarEstudianteFacultadNamed(String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteFacultadNamed(facultad);
	}

	@Override
	public List<Estudiante> buscarEstudianteFacultadNombreApellidoNamedTyped(String facultad, String nombre,
			String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteFacultadNombreApellidoNamedTyped(facultad, nombre, apellido);
	}

	@Override
	public Estudiante buscarEstudianteCedulaFacultadNamedTyped(String cedula, String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteCedulaFacultadNamedTyped(cedula, facultad);
	}

	@Override
	public Estudiante buscarCedulaApellidoNative(String cedula, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarCedulaApellidoNative(cedula, apellido);
	}

	@Override
	public List<Estudiante> buscarApellidoFacultadNative(String apellido, String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarApellidoFacultadNative(apellido, facultad);
	}

	@Override
	public Estudiante buscarCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarCedulaNamedNative(cedula);
	}

	@Override
	public List<Estudiante> buscarNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarNombreApellidoNamedNative(nombre, apellido);
	}

	@Override
	public Estudiante buscarEstudianteCriteriaApi(String cedula, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteCriteriaApi(cedula, nombre);
	}

	@Override
	public List<Estudiante> buscarEstudianteListaCriteriaApi(String apellido, String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepo.buscarEstudianteListaCriteriaApi(apellido, facultad);
	}

	
	
}
