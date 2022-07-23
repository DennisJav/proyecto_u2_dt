package com.uce.ec.service;

import com.uce.ec.modelo.onetoone.Ciudadano;

public interface ICiudadanoService {

	void crearCiudadano(Ciudadano ciudadano);
	Ciudadano buscarCiudadano(String cedula);
	void eliminarCiudadano(Integer id);
	void actualizarCiudadano(Ciudadano ciudadano);
}
