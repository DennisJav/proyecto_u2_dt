package com.uce.ec;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.modelo.Persona;
import com.uce.ec.service.IEstudianteJdbcService;
import com.uce.ec.service.IPersonaJdbcService;
import com.uce.ec.service.IPersonaJpaService;
import com.uce.ec.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2DtApplication implements CommandLineRunner{

	private static final Logger LOG = LogManager.getLogger( ProyectoU2DtApplication.class);
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		LOG.info("Metodo buscar todos");
//		List<PersonaTo> listaPersonas= this.iPersonaJdbcService.buscarTodos();
//		LOG.info(listaPersonas.toString());
		
		LOG.info("Metodos CRUD JPA ");
		LOG.info("--------------CREAR-----------------");
		Persona p=new Persona();
		p.setNombre("Dennis");
		p.setApellido("Tapia");
		this.iPersonaJpaService.crearPersona(p);
		LOG.info("Persona Creada: "+p);
		LOG.info("--------------BUSCAR-----------------");
		LOG.info("Persona Buscada: "+this.iPersonaJpaService.buscarPersonaCedula(2));
		LOG.info("--------------ACTUALIZAR-----------------");
		p.setId(2);
		p.setNombre("Javier");
		//this.iPersonaJpaService.actualizarPersona(p);
		LOG.info("--------------ELIMINAR-----------------");
		//this.iPersonaJpaService.eliminarPersona(1);
	}

}
