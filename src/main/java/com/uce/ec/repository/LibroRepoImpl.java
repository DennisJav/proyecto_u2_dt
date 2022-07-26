package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.manytomany.Libro;

@Repository
@Transactional
public class LibroRepoImpl implements ILibroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearLibro(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	
	
}
