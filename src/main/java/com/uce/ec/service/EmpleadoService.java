package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.Empleado;
import com.uce.ec.repository.IEmpleadoRepo;

@Service
public class EmpleadoService implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepo empleadoRepo;
	
	@Override
	public void crearEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.crearEmpleado(empleado);
	}

}
