package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.repository.IEstudianteJdbcRepo;
import com.uce.ec.to.EstudianteTo;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService{

	@Autowired
	private IEstudianteJdbcRepo estudianteJdbcRepo;
	
	@Override
	public void crearEstudiante(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJdbcRepo.crearEstudiante(estudiante);
	}

	@Override
	public EstudianteTo buscarEstudiante(int id) {
		// TODO Auto-generated method stub
		return this.estudianteJdbcRepo.buscarEstudiante(id);
	}

	@Override
	public void eliminarEstudiante(int id) {
		// TODO Auto-generated method stub
		this.estudianteJdbcRepo.eliminarEstudiante(id);
	}

	@Override
	public void actualizarEstudiante(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.estudianteJdbcRepo.actualizarEstudiante(estudiante);
	}

	
}
