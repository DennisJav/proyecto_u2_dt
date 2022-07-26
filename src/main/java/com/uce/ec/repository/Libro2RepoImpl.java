package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.manytomany.Libro2;

@Repository
@Transactional
public class Libro2RepoImpl implements ILibro2Repo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearLibro2(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public Libro2 buscarLibro2(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro2.class, id);
	}

	@Override
	public void actualizarLibro2(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro2);
	}

	@Override
	public void eliminarLibro2(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarLibro2(id));
	}
	
	
}
