package com.uce.ec.cajero.repository;

import com.uce.ec.cajero.modelo.Factura;

public interface IFacturaRepo {

	Factura consultarFactura(Integer id);
}
