package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Ciudadano;
import com.uce.ec.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	
	@Override
	public void crearCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.crearCiudadano(ciudadano);
	}

	@Override
	public Ciudadano buscarCiudadano(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.buscarCiudadano(cedula);
	}

	@Override
	public void eliminarCiudadano(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminarCiudadano(id);
	}

	@Override
	public void actualizarCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizarCiudadano(ciudadano);
	}
	
	

}
