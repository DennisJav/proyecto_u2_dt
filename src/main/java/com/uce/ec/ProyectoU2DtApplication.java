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
public class ProyectoU2DtApplication implements CommandLineRunner {

	private static final Logger LOG = LogManager.getLogger(ProyectoU2DtApplication.class);

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
//		
//		LOG.info("Metodos CRUD JPA ");
//		LOG.info("--------------CREAR-----------------");
		Persona e = new Persona();
//		e.setNombre("Dennis");
//		e.setApellido("Tapia");
//		e.setGenero("M");
//		e.setCedula("1234435");
//		this.iPersonaJpaService.crearPersona(e);
//		LOG.info("Persona Creada: "+e);
//		LOG.info("--------------BUSCAR POR ID-----------------");
//		//LOG.info("Persona Buscada: "+this.iPersonaJpaService.buscarPersona(2));
//		LOG.info("--------------ACTUALIZAR-----------------");
//		e.setId(2);
//		e.setNombre("Dennis");
//		e.setCedula("1712");
//		e.setApellido("Tapia");
//		e.setGenero("M");
//		this.iPersonaJpaService.actualizarPersona(e);
//		LOG.info("--------------ELIMINAR-----------------");
//		//this.iPersonaJpaService.eliminarPersona(1);
//		LOG.info("--------------BUSCAR POR CEDULA-----------------");
//		LOG.info("Persona Buscada: "+this.iPersonaJpaService.buscarCedula("123"));
//		LOG.info("--------------BUSCAR POR APELLIDO-----------------");
//		
//		List<Persona> listaPersonas = this.iPersonaJpaService.buscarApellido("Ortiz");
//		for(Persona per: listaPersonas) {
//			LOG.info("Personas Buscadas: "+per);
//		}
//		
//		int o = this.iPersonaJpaService.actualizarPorApellido("M", "Imba");
//		LOG.info("Actualizados: "+o);
//		int i=this.iPersonaJpaService.eliminarPorGenero("F");
//		LOG.info("Eliminados: "+i);
//		
//		TALLER 20 

		LOG.info("--------------BUSCAR POR CEDULA TYPED-----------------");
		LOG.info("BUSQUEDA POR TYPED: " + this.iPersonaJpaService.buscarCedulaNamed("1712"));

		LOG.info("--------------BUSCAR POR CEDULA NAMED-----------------");
		LOG.info("BUSQUEDA POR NAMED: " + this.iPersonaJpaService.buscarCedulaNamed("1712"));

		LOG.info("--------------BUSCAR POR CEDULA TYPED NAMED-----------------");
		LOG.info("BUSQUEDA POR TYPED NAMED: " + this.iPersonaJpaService.buscarCedulaTypedNamed("1712"));

		LOG.info("--------------BUSCAR POR NOMBRE Y APELLIDO TYPED NAMED-----------------");
		LOG.info("BUSQUEDA POR NOMBRE Y APELLIDO SEGUN TYPED NAMED: ");
		List<Persona> per = this.iPersonaJpaService.buscarNombreApellido("Dennis", "Tapia");
		for (Persona item : per) {
			LOG.info("Persona buscada: " + item);
		}

	}

}
