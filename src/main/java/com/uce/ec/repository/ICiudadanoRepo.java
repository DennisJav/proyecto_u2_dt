package com.uce.ec.repository;

import com.uce.ec.modelo.Ciudadano;

public interface ICiudadanoRepo {

	void crearCiudadano(Ciudadano ciudadano);
	Ciudadano buscarCiudadano(String cedula);
	Ciudadano buscarCiudadanoId(Integer id);
	void eliminarCiudadano(Integer id);
	void actualizarCiudadano(Ciudadano ciudadano);
	
}
