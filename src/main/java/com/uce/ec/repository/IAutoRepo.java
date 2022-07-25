package com.uce.ec.repository;

import com.uce.ec.modelo.onetomany.Auto;

public interface IAutoRepo {
	
	void crearAuto(Auto auto);
	Auto buscarAuto(Integer id);
	void eliminarAuto(Integer id);
	void actualizarAuto(Auto auto);
	
	
}
