package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.manytomany.Libro2;
import com.uce.ec.repository.ILibro2Repo;

@Service
public class Libro2Service implements ILibro2Service{

	@Autowired
	private ILibro2Repo libro2Repo;
	
	
	@Override
	public void crearLibro2(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.libro2Repo.crearLibro2(libro2);
	}

	@Override
	public Libro2 buscarLibro2(Integer id) {
		// TODO Auto-generated method stub
		return this.libro2Repo.buscarLibro2(id);
	}

	@Override
	public void actualizarLibro2(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.libro2Repo.actualizarLibro2(libro2);
	}

	@Override
	public void eliminarLibro2(Integer id) {
		// TODO Auto-generated method stub
		this.libro2Repo.eliminarLibro2(id);
	}

	
	
}
