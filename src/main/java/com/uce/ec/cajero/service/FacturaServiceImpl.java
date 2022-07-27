package com.uce.ec.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.cajero.modelo.Factura;
import com.uce.ec.cajero.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public Factura consultarFactura(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepo.consultarFactura(id);
	}

	
	
}
