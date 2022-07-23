package com.uce.ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.onetomany.Hotel;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void crearHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	
}
