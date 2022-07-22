package com.uce.ec;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.modelo.Ciudadano;
import com.uce.ec.modelo.Empleado;
import com.uce.ec.modelo.Estudiante;
import com.uce.ec.modelo.EstudianteFacultadCont;
import com.uce.ec.modelo.EstudianteSencillo;
import com.uce.ec.modelo.Pasaporte;
import com.uce.ec.modelo.Persona;
import com.uce.ec.modelo.PersonaContadorGenero;
import com.uce.ec.modelo.PersonaSencilla;
import com.uce.ec.service.ICiudadanoService;
import com.uce.ec.service.IEmpleadoService;
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
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		
//		LOG.info("Metodos CRUD JPA ");
//		LOG.info("--------------CREAR-----------------");
//		Persona e = new Persona();
//		e.setNombre("Ronny");
//		e.setApellido("Marquez");
//		e.setGenero("M");
//		e.setCedula("111222");
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
		
		LOG.info("--------------------RELACION ONE TO ONE--------------");
		LOG.info("--------------------INSERTAR--------------");
		Ciudadano c1=new Ciudadano();
		c1.setApellido("Mñoz");
		c1.setNombre("Javi");
		c1.setCedula("89");
		c1.setFechaNacimiento(LocalDateTime.of(1996, Month.JANUARY, 16, 10, 0));
		
		
		Empleado e1=new Empleado();
		e1.setCodigoIess("11254DDE");
		e1.setSalario(new BigDecimal(1000));
		e1.setCiudadano(c1);
		c1.setEmpleado(e1);
		
		Pasaporte pas1=new Pasaporte();
		pas1.setNumero("1123SORN");
		pas1.setFechaEmision(LocalDateTime.now());
		pas1.setFechaCaducidad(LocalDateTime.of(2025, Month.JANUARY, 20, 10, 0));
		pas1.setCiudadano(c1);
		c1.setPasaporte(pas1);
		//
		this.ciudadanoService.crearCiudadano(c1);
		LOG.info("--------------------BUSCAR--------------");
		LOG.info("Ciudadano buscada: "+this.ciudadanoService.buscarCiudadano("89"));
		
		LOG.info("--------------------ACTUALIZAR--------------");
		Ciudadano c2=new Ciudadano();
		c2.setId(21);
		c2.setApellido("Nuñez12");
		this.ciudadanoService.actualizarCiudadano(c2);
		
		LOG.info("--------------------ELIMINAR--------------");
	//	this.ciudadanoService.eliminarCiudadano(7);
		
		
	}

}
