package com.uce.ec.service;

import com.uce.ec.modelo.onetomany.Auto;

public interface IAutoService {
	void crearAuto(Auto auto);
	Auto buscarAuto(Integer id);
	void eliminarAuto(Integer id);
	void actualizarAuto(Auto auto);
}
