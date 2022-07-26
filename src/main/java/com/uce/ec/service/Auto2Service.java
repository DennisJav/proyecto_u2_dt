package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.manytomany.Autor2;
import com.uce.ec.repository.IAutor2Repo;

@Service
public class Auto2Service implements IAutor2Service{

	@Autowired
	private IAutor2Repo autor2Repo;
	
	
	@Override
	public void crearAutor2(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.autor2Repo.crearAutor2(autor2);
	}

	@Override
	public Autor2 buscarAutor2(Integer id) {
		// TODO Auto-generated method stub
		return this.autor2Repo.buscarAutor2(id);
	}

	@Override
	public void actualizarAutor2(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.autor2Repo.actualizarAutor2(autor2);
	}

	@Override
	public void eliminarAutor2(Integer id) {
		// TODO Auto-generated method stub
		this.autor2Repo.eliminarAutor2(id);
	}

	
	
}
