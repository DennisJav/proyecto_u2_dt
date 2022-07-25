package com.uce.ec;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
import com.uce.ec.modelo.onetomany.Auto;
import com.uce.ec.modelo.onetomany.Comerciante;
import com.uce.ec.modelo.onetomany.Habitacion;
import com.uce.ec.modelo.onetomany.Hotel;
import com.uce.ec.modelo.onetoone.Ciudadano;
import com.uce.ec.modelo.onetoone.Empleado;
import com.uce.ec.modelo.onetoone.Pasaporte;
import com.uce.ec.service.IAutoService;
import com.uce.ec.service.ICiudadanoService;
import com.uce.ec.service.IComercianteService;
import com.uce.ec.service.IEmpleadoService;
import com.uce.ec.service.IEstudianteJdbcService;
import com.uce.ec.service.IEstudianteJpaService;
import com.uce.ec.service.IHabitacionService;
import com.uce.ec.service.IHotelService;
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
//		
//		LOG.info("--------------------RELACION ONE TO ONE--------------");
//		LOG.info("--------------------INSERTAR--------------");
//		Ciudadano c1=new Ciudadano();
//		c1.setApellido("Mñoz");
//		c1.setNombre("Javi");
//		c1.setCedula("89");
//		c1.setFechaNacimiento(LocalDateTime.of(1996, Month.JANUARY, 16, 10, 0));
//		
//		
//		Empleado e1=new Empleado();
//		e1.setCodigoIess("11254DDE");
//		e1.setSalario(new BigDecimal(1000));
//		e1.setCiudadano(c1);
//		c1.setEmpleado(e1);
//		
//		Pasaporte pas1=new Pasaporte();
//		pas1.setNumero("1123SORN");
//		pas1.setFechaEmision(LocalDateTime.now());
//		pas1.setFechaCaducidad(LocalDateTime.of(2025, Month.JANUARY, 20, 10, 0));
//		pas1.setCiudadano(c1);
//		c1.setPasaporte(pas1);
//		//
//		//this.ciudadanoService.crearCiudadano(c1);
//		LOG.info("--------------------BUSCAR--------------");
//	//	LOG.info("Ciudadano buscada: "+this.ciudadanoService.buscarCiudadano("89"));
//		
//		LOG.info("--------------------ACTUALIZAR--------------");
//		Ciudadano c2=new Ciudadano();
//		//c2.setId(21);
//	//	c2.setApellido("Nuñez12");
//	//	this.ciudadanoService.actualizarCiudadano(c2);
//		
//		LOG.info("--------------------ELIMINAR--------------");
//		this.ciudadanoService.eliminarCiudadano(1);
//		
//
//		LOG.info("--------------------RELACION ONE TO MANY--------------");
//		LOG.info("--------------------INSERTAR--------------");
		
//		Hotel h1=new Hotel();
//		h1.setNombre("Quito");
//		h1.setDireccion("Colon");
//		this.hotelService.crearHotel(h1);
		
		//Buscar un hotel por numero o algun atributo
		//
//		Hotel hote=new Hotel();
//		hote.setId(1);
//		
//		Habitacion habi1=new Habitacion();
//		habi1.setNumero("A2");
//		habi1.setPiso("1");
//		habi1.setTipo("Normal");
//		habi1.setHotel(hote);
//		this.habitacionService.crearHabitacion(habi1);
//		
//		Habitacion habi2=new Habitacion();
//		habi2.setNumero("A1");
//		habi2.setPiso("1");
//		habi2.setTipo("Matrimonial");
//		habi2.setHotel(hote);
//		this.habitacionService.crearHabitacion(habi2);
////		

		
		

		LOG.info("--------------------RELACION ONE TO MANY--------------");
		LOG.info("--------------------INSERTAR--------------");
		

		Comerciante com=new Comerciante();
		com.setNombre("Dennis");
		com.setApellido("Tapia");
		com.setCedula("12345");
		com.setAgencia("SUR");
		
		Auto a=new Auto();
		a.setModelo("Toyota");
		a.setMarca("Corolla");
		a.setCilindraje("1AS3");
		a.setPlaca("AAS124");
		a.setComerciante(com);
		
		
		Auto b=new Auto();
		b.setModelo("Toyota");
		b.setMarca("RAV3");
		b.setCilindraje("1AASS3");
		b.setPlaca("POS321");
		b.setComerciante(com);
		//
		
		
		Auto c=new Auto();
		c.setModelo("CHERRY");
		c.setMarca("TIGGO2 ");
		c.setCilindraje("1SADASD12");
		c.setPlaca("PPP2323");
		c.setComerciante(com);
		//
		
		List<Auto> listaAutos=new ArrayList<>();
		listaAutos.add(a);
		listaAutos.add(b);
		listaAutos.add(c);
		
		com.setAutos(listaAutos);
		
	//	this.comercianteService.crearComerciante(com);

	
		LOG.info("--------------------ACTUALIZAR--------------");
		
		Comerciante com2=new Comerciante();
		com2.setId(1);
		com2.setNombre("Dennis");
		com2.setApellido("Tapia");
		com2.setCedula("12345asdasd");
		com2.setAgencia("SUR");
		//com2.setAutos(listaAutos);
		//this.comercianteService.actulizarComerciante(com2);
		
		
		LOG.info("--------------------BUSCAR--------------");
		
		
	//	LOG.info( this.autoService.buscarAuto(2));
		this.comercianteService.buscarComerciante(1);
		
		LOG.info("--------------------ELIMINAR--------------");
		
		this.comercianteService.eliminarComerciate(1);
		
		
	}

}
