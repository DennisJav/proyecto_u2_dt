package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Ciudadano;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

	@Override
	public Ciudadano buscarCiudadano(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("select c from Ciudadano c where c.cedula =:valoruno", Ciudadano.class);
		myQuery.setParameter("valoruno", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public void eliminarCiudadano(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCiudadanoId(id));
	}

	@Override
	public void actualizarCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);
	}

	@Override
	public Ciudadano buscarCiudadanoId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

}
