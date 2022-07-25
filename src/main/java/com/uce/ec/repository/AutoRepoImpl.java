package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.onetomany.Auto;

@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(auto);
	}

	@Override
	public Auto buscarAuto(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Auto.class, id);
	}

	@Override
	public void eliminarAuto(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarAuto(id));
	}

	@Override
	public void actualizarAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(auto);
	}
	
	

}
