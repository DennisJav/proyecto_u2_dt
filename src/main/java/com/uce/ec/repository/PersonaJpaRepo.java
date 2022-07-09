package com.uce.ec.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepo implements IPersonaJpaRepo {

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
		Persona p = this.buscarPersonaCedula(id);

		this.entityManager.remove(p);
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public Persona buscarCedula(String cedula) {
		// TODO Auto-generated method stub

		Query jpqlQuery = this.entityManager.createQuery("select p from Persona p where p.cedula = :valoruno",
				Persona.class);
		jpqlQuery.setParameter("valoruno", cedula);
		return (Persona) jpqlQuery.getSingleResult();

	}

	@Override
	public List<Persona> buscarApellido(String apellido) {
		Query jpqlQuery = this.entityManager.createQuery("select p from Persona p where p.apellido = :valoruno",
				Persona.class);
		jpqlQuery.setParameter("valoruno", apellido);

		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarGenero(String genero) {
		Query jpqlQuery = this.entityManager.createQuery("select p from Persona p where p.genero = :valoruno",
				Persona.class);
		jpqlQuery.setParameter("valoruno", genero);

		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarNombre(String nombre) {
		Query jpqlQuery = this.entityManager.createQuery("select p from Persona p where p.nombre = :valoruno",
				Persona.class);
		jpqlQuery.setParameter("valoruno", nombre);

		return jpqlQuery.getResultList();
	}

	@Override
	public int actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero=:datoGenero WHERE p.apellido=:datoApellido");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}



	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createQuery("delete from Persona p where p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	
	}

	
	
}
