package com.uce.ec.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.ec.to.Persona;

@Repository
public class PersonaJdbcRepoImpl implements IPersonaJdbcRepo {

	// INYECCION DE JDBC
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crearPersona(Persona persona) {

		this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?,?,?)",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido() });

	}

	@Override
	public Persona buscarPersonaCedula(int id) {
		// TODO Auto-generated method stub
		
		
		return this.jdbcTemplate.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Persona>(Persona.class));

	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from persona where id=?", new Object[] { id });
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update persona set nombre=?, apellido=? where id=?",
				new Object[] { persona.getNombre(), persona.getApellido(), persona.getId() });
	}

}
