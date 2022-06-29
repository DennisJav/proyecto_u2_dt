package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepo implements IPersonaJpaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public Persona buscarPersonaCedula(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void eliminarPersona(Integer id) {
		// TODO Auto-generated method stub
		Persona p=this.buscarPersonaCedula(id);
		
		this.entityManager.remove(p);
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	
}
