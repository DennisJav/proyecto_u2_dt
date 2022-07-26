package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.manytomany.Autor2;

@Repository
@Transactional
public class Autor2RepoImpl implements IAutor2Repo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearAutor2(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor2);
	}

	@Override
	public Autor2 buscarAutor2(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor2.class, id);
	}

	@Override
	public void actualizarAutor2(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor2);
	}

	@Override
	public void eliminarAutor2(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarAutor2(id));
	}
	

}
