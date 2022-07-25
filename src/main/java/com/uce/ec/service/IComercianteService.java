package com.uce.ec.service;

import com.uce.ec.modelo.onetomany.Comerciante;

public interface IComercianteService {
	void crearComerciante(Comerciante comerciante);
	Comerciante buscarComerciante(Integer id);
	void eliminarComerciate(Integer id);
	void actulizarComerciante(Comerciante comerciante);
}
