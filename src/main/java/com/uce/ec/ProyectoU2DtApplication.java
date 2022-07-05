package com.uce.ec;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.modelo.Estudiante;
import com.uce.ec.modelo.Persona;
import com.uce.ec.service.IEstudianteJdbcService;
import com.uce.ec.service.IEstudianteJpaService;
import com.uce.ec.service.IPersonaJdbcService;
import com.uce.ec.service.IPersonaJpaService;
import com.uce.ec.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2DtApplication implements CommandLineRunner{

	private static final Logger LOG = LogManager.getLogger( ProyectoU2DtApplication.class);
	
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		LOG.info("Metodos CRUD JPA ");
		LOG.info("--------------CREAR-----------------");
		Persona e=new Persona();
		e.setNombre("Antonio");
		e.setApellido("Ortiz");

		this.iPersonaJpaService.crearPersona(e);
		LOG.info("Persona Creada: "+e);
		LOG.info("--------------BUSCAR-----------------");
		//LOG.info("Persona Buscada: "+this.iPersonaJpaService.buscarPersonaCedula(2));
		LOG.info("--------------ACTUALIZAR-----------------");
		e.setId(1);
		e.setNombre("Javier");
		//this.iPersonaJpaService.actualizarPersona(e);
		LOG.info("--------------ELIMINAR-----------------");
		//this.iPersonaJpaService.eliminarPersona(1);
	}

}
