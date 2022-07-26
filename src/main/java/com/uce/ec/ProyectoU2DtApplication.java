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
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		LOG.info("--------------------RELACION MANY TO MANY--------------");
		LOG.info("--------------------INSERTAR--------------");
		
		List<Autor2> aut=new ArrayList<>(); 
		List<Libro2> lib=new ArrayList<>();
		
		Autor2 autor=new Autor2();
		autor.setNombre("Dennis");
		aut.add(autor);
		
//		
//		Autor2 autor2=new Autor2();
//		autor2.setNombre("Javier");
//		aut.add(autor2);
//		
		Libro2 libro2=new Libro2();
		libro2.setCantidad_paginas(123);
		libro2.setTitulo("asd");
		lib.add(libro2);
		
		Libro2 libro22=new Libro2();
		libro22.setCantidad_paginas(114);
		libro22.setTitulo("cvcv");
		lib.add(libro22);
		
		
		Libro2_Autor2  l=new Libro2_Autor2();
		//l.setAutor2(autor2);
		l.setAutor2(autor);
		l.setLibro2(libro2);
		
		Libro2_Autor2  l2=new Libro2_Autor2();
		//l.setAutor2(autor2);
		l2.setAutor2(autor);
		l2.setLibro2(libro22);
		
		
		
		List<Libro2_Autor2> lista=new ArrayList<>();
		lista.add(l);
		lista.add(l2);
	
		autor.setLibro2_autor2(lista);
	//	this.autor2Service.crearAutor2(autor);
		
		
		//  1 libro 2 autores
		
		List<Autor2> aut1=new ArrayList<>(); 
		List<Libro2> lib1=new ArrayList<>();
		
		//autor 1
		Autor2 autor3=new Autor2();
		autor3.setNombre("Dennis");
		aut1.add(autor3);
		
		//autor 2
		Autor2 autor4=new Autor2();
		autor4.setNombre("Javier");
		aut1.add(autor4);
		// libro
		Libro2 libro3=new Libro2();
		libro3.setCantidad_paginas(123);
		libro3.setTitulo("aasdasdasdasdsd");
		lib1.add(libro3);
		
		
		
		Libro2_Autor2  l3=new Libro2_Autor2();
		//l.setAutor2(autor2);
		l3.setAutor2(autor3);
		l3.setLibro2(libro3);
		
		Libro2_Autor2  l4=new Libro2_Autor2();
		//l.setAutor2(autor2);
		l4.setAutor2(autor4);
		l4.setLibro2(libro3);
		
		
		
		List<Libro2_Autor2> lista2=new ArrayList<>();
		lista2.add(l3);
		lista2.add(l4);
	
		libro3.setLibro2_autor2(lista2);
		
		
		
		this.libro2Service.crearLibro2(libro3);
	}

}
