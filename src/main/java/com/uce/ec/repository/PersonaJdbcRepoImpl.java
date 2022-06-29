package com.uce.ec.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.uce.ec.to.PersonaTo;

@Repository
public class PersonaJdbcRepoImpl implements IPersonaJdbcRepo {

	// INYECCION DE JDBC
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crearPersona(PersonaTo persona) {

		this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?,?,?)",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido() });

	}

	@Override
	public PersonaTo buscarPersonaCedula(int id) {
		// TODO Auto-generated method stub
		
		
		return this.jdbcTemplate.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<PersonaTo>(PersonaTo.class));

	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from persona where id=?", new Object[] { id });
	}

	@Override
	public void actualizarPersona(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update persona set nombre=?, apellido=? where id=?",
				new Object[] { persona.getNombre(), persona.getApellido(), persona.getId() });
	}

	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		
		return this.jdbcTemplate.query("select * from persona",new PersonaRowMapper());
	}

	class PersonaRowMapper implements RowMapper<PersonaTo>{

		@Override
		public PersonaTo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			PersonaTo p=new PersonaTo();
			p.setId(rs.getInt("id"));
			p.setNombre(rs.getString("nombre"));
			p.setApellido(rs.getString("apellido"));
			return p;
		}
		
	}
	
}
