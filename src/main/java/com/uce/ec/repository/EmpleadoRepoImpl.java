package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Empleado;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}
	

}
