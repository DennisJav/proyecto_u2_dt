package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.onetomany.Auto;
import com.uce.ec.repository.IAutoRepo;

@Service
public class AutoServiceImpl implements IAutoService{

	@Autowired
	private IAutoRepo autoRepo;
	
	@Override
	public void crearAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.autoRepo.crearAuto(auto);
	}

	@Override
	public Auto buscarAuto(Integer id) {
		// TODO Auto-generated method stub
		return this.autoRepo.buscarAuto(id);
	}

	@Override
	public void eliminarAuto(Integer id) {
		// TODO Auto-generated method stub
		this.autoRepo.eliminarAuto(id);
	}

	@Override
	public void actualizarAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.autoRepo.actualizarAuto(auto);
	}


}
