package com.uce.ec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.service.IPersonaJdbcService;
import com.uce.ec.to.Persona;

@SpringBootApplication
public class ProyectoU2DtApplication implements CommandLineRunner{

	private static final Logger LOG = LogManager.getLogger( ProyectoU2DtApplication.class);
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		LOG.info("Metodo Insertar");
		Persona p=new Persona();
//		p.setId(3);
//		p.setNombre("Javier");
//		p.setApellido("Ortiz");
//		this.iPersonaJdbcService.crearPersona(p);
//		LOG.info("Persona insertada: "+p.toString());
		
//		LOG.info("Metodo Actualizar");
//		p.setId(1);
//		p.setNombre("A");
//		p.setApellido("B");
//		this.iPersonaJdbcService.actualizarPersona(p);
//		LOG.info("Persona actualizada: "+p.toString());
		
//		LOG.info("Metodo Eliminar");
//		int id=1;
//		this.iPersonaJdbcService.eliminarPersona(id);
//		LOG.info("Persona de id: "+ id +" Eliminada");
		
		LOG.info("Metodo Buscar");
		int id=2;
		LOG.info("Persona buscada: "+ this.iPersonaJdbcService.buscarPersonaCedula(id));
		
		
	}

}
