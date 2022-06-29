package com.uce.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.repository.IPersonaJdbcRepo;
import com.uce.ec.to.PersonaTo;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepo iPersonaJdbcRepo;
	
	@Override
	public void crearPersona(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.crearPersona(persona);
	}

	@Override
	public PersonaTo buscarPersonaCedula(int id) {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepo.buscarPersonaCedula(id);
	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.eliminarPersona(id);
	}

	@Override
	public void actualizarPersona(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepo.actualizarPersona(persona);
	}

	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepo.buscarTodos();
	}
	

}
