package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.manytomany.Libro;
import com.uce.ec.repository.ILibroRepo;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepo libroRepo;
	
	@Override
	public void crearLibro(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepo.crearLibro(libro);
	}

}
