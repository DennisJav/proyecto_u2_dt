package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.onetomany.Habitacion;
import com.uce.ec.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService{

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public void crearHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.crearHabitacion(habitacion);
	}

}
