package com.uce.ec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.service.IEstudianteJdbcService;
import com.uce.ec.service.IPersonaJdbcService;
import com.uce.ec.to.Estudiante;
import com.uce.ec.to.Persona;

@SpringBootApplication
public class ProyectoU2DtApplication implements CommandLineRunner{

	private static final Logger LOG = LogManager.getLogger( ProyectoU2DtApplication.class);
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Metodo Insertar");
		Estudiante e=new Estudiante();
		e.setId(3);
		e.setNombre("Javier");
		e.setApellido("Ortiz");
		e.setCedula("1234");
		e.setFacultad("Ingenieria");
//		this.iEstudianteJdbcService.crearEstudiante(e);
		LOG.info("Estudiante insertado: "+e.toString());
//		
		LOG.info("Metodo Actualizar");
		e.setId(1);
		e.setNombre("A");
		e.setApellido("B");
		e.setCedula("1111");
		e.setFacultad("Mate");
		this.iEstudianteJdbcService.actualizarEstudiante(e);
		LOG.info("Estudiante actualizado: "+e.toString());
//		
		LOG.info("Metodo Eliminar");
		int id=1;
		this.iEstudianteJdbcService.eliminarEstudiante(id);
		LOG.info("Estudiante de id: "+ id +" Eliminada");
//		
		LOG.info("Metodo Buscar");
		LOG.info("Estudiante buscado: "+ this.iEstudianteJdbcService.buscarEstudiante(2));
		
		
	}

}
