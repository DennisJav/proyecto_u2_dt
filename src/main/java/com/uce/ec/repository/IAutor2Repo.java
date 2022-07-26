package com.uce.ec.repository;

import com.uce.ec.modelo.manytomany.Autor2;

public interface IAutor2Repo {

	void crearAutor2(Autor2 autor2);
	Autor2 buscarAutor2(Integer id);
	void actualizarAutor2(Autor2 autor2);
	void eliminarAutor2(Integer id);
}
