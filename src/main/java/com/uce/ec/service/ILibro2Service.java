package com.uce.ec.service;

import com.uce.ec.modelo.manytomany.Libro2;

public interface ILibro2Service {

	void crearLibro2(Libro2 libro2);
	Libro2 buscarLibro2(Integer id);
	void actualizarLibro2(Libro2 libro2);
	void eliminarLibro2(Integer id);
	
	
	
}
