package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.onetomany.Comerciante;
import com.uce.ec.repository.IComercianteRepo;

@Service
public class ComercianteSrviceImpl implements IComercianteService{

	@Autowired
	private IComercianteRepo comercianteRepo;
	
	@Override
	public void crearComerciante(Comerciante comerciante) {
		// TODO Auto-generated method stub
		this.comercianteRepo.crearComerciante(comerciante);
	}

	@Override
	public Comerciante buscarComerciante(Integer id) {
		// TODO Auto-generated method stub
		return this.comercianteRepo.buscarComerciante(id);
	}

	@Override
	public void eliminarComerciate(Integer id) {
		// TODO Auto-generated method stub
		this.comercianteRepo.eliminarComerciate(id);
	}

	@Override
	public void actulizarComerciante(Comerciante comerciante) {
		// TODO Auto-generated method stub
		this.comercianteRepo.actulizarComerciante(comerciante);
	}

}
