package com.uce.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Persona;
import com.uce.ec.repository.IPersonaJpaRepo;

@Service
public class IPersonaJpaServiceImpl implements IPersonaJpaService{

	@Autowired
	private IPersonaJpaRepo personaJpaRepo;
	
	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJpaRepo.crearPersona(persona);
	}

	@Override
	public Persona buscarPersona(Integer id) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarPersonaCedula(id);
	}

	@Override
	public void eliminarPersona(Integer id) {
		// TODO Auto-generated method stub
		this.personaJpaRepo.eliminarPersona(id);
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJpaRepo.actualizarPersona(persona);
	}

	@Override
	public Persona buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedula(cedula);
	}

	@Override
	public List<Persona> buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarApellido(apellido);
	}

	@Override
	public int actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.actualizarPorApellido(genero, apellido);
	}

	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.eliminarPorGenero(genero);
	}

	@Override
	public Persona buscarCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaTyped(cedula);
	}

	@Override
	public Persona buscarCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaNamed(cedula);
	}

	@Override
	public Persona buscarCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaTypedNamed(cedula);
	}

	@Override
	public List<Persona> buscarNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarNombreApellido(nombre, apellido);
	}

	@Override
	public Persona buscarCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaNative(cedula);
	}

	@Override
	public Persona buscarCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaNamedNative(cedula);
	}

	@Override
	public Persona buscarCedulaCriteriaAPI(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarCedulaCriteriaAPI(cedula);
	}

	@Override
	public Persona buscarDinamicamenteCriteriaAPI(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRepo.buscarDinamicamenteCriteriaAPI(nombre, apellido, genero);
	}
	
	

}
