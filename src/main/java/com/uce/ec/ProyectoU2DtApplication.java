package com.uce.ec;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.cajero.modelo.DetalleFactura;
import com.uce.ec.cajero.modelo.Factura;
import com.uce.ec.cajero.service.IFacturaService;
import com.uce.ec.modelo.Estudiante;
import com.uce.ec.modelo.EstudianteFacultadCont;
import com.uce.ec.modelo.EstudianteSencillo;
import com.uce.ec.modelo.Persona;
import com.uce.ec.modelo.PersonaContadorGenero;
import com.uce.ec.modelo.PersonaSencilla;
import com.uce.ec.modelo.manytomany.Autor;
import com.uce.ec.modelo.manytomany.Autor2;
import com.uce.ec.modelo.manytomany.Libro;
import com.uce.ec.modelo.manytomany.Libro2;
import com.uce.ec.modelo.manytomany.Libro2_Autor2;
import com.uce.ec.modelo.onetomany.Auto;
import com.uce.ec.modelo.onetomany.Comerciante;
import com.uce.ec.modelo.onetomany.Habitacion;
import com.uce.ec.modelo.onetomany.Hotel;
import com.uce.ec.modelo.onetoone.Ciudadano;
import com.uce.ec.modelo.onetoone.Empleado;
import com.uce.ec.modelo.onetoone.Pasaporte;
import com.uce.ec.service.IAutoService;
import com.uce.ec.service.IAutor2Service;
import com.uce.ec.service.ICiudadanoService;
import com.uce.ec.service.IComercianteService;
import com.uce.ec.service.IEmpleadoService;
import com.uce.ec.service.IEstudianteJdbcService;
import com.uce.ec.service.IEstudianteJpaService;
import com.uce.ec.service.IHabitacionService;
import com.uce.ec.service.IHotelService;
import com.uce.ec.service.ILibro2Service;
import com.uce.ec.service.ILibroService;
import com.uce.ec.service.IPersonaJdbcService;
import com.uce.ec.service.IPersonaJpaService;
import com.uce.ec.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2DtApplication implements CommandLineRunner {

	private static final Logger LOG = LogManager.getLogger(ProyectoU2DtApplication.class);

	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;

	@Autowired
	private IHotelService hotelService;
	@Autowired
	private IHabitacionService habitacionService;

	@Autowired
	private IAutoService autoService;
	@Autowired
	private IComercianteService comercianteService;

	@Autowired
	private ILibroService libroService;

	@Autowired
	private ILibro2Service libro2Service;
	
	@Autowired IAutor2Service autor2Service;
	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	
		LOG.info("--------------------Buscar--------------");
		Factura fact = this.facturaService.consultarFactura(1);
		LOG.info(fact.getNumero());
		LOG.info(fact.getFecha());
		LOG.info(fact.getCliente().getNumeroTarjeta());
		
		List<DetalleFactura> detalleFacturas = fact.getDetalleFacturas();
		for(DetalleFactura deta:detalleFacturas) {
			LOG.info(deta);
		}
		
		
	}

}
