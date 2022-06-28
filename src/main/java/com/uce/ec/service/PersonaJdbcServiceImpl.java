package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.repository.IPersonaJdbcRepo;
import com.uce.ec.to.Persona;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepo iPersonaJdbcRepo;
	
	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.crearPersona(persona);
	}

	@Override
	public Persona buscarPersonaCedula(int id) {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepo.buscarPersonaCedula(id);
	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.eliminarPersona(id);
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.actualizarPersona(persona);
	}
	

}
