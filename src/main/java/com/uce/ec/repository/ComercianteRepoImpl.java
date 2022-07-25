package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.onetomany.Comerciante;

@Repository
@Transactional
public class ComercianteRepoImpl implements IComercianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void crearComerciante(Comerciante comerciante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(comerciante);
	}

	@Override
	public Comerciante buscarComerciante(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Comerciante.class, id);
	}

	@Override
	public void eliminarComerciate(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarComerciante(id));
	}

	@Override
	public void actulizarComerciante(Comerciante comerciante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(comerciante);
	}

}
