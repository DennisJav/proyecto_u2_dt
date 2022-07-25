package com.uce.ec.repository;

import com.uce.ec.modelo.onetomany.Comerciante;

public interface IComercianteRepo {

	void crearComerciante(Comerciante comerciante);
	Comerciante buscarComerciante(Integer id);
	void eliminarComerciate(Integer id);
	void actulizarComerciante(Comerciante comerciante);
	
}
