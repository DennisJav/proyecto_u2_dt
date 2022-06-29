package com.uce.ec.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.ec.to.Estudiante;
import com.uce.ec.to.PersonaTo;

@Repository
public class EstudianteJdbcRepoImpl implements IEstudianteJdbcRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crearEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, cedula, facultad) values (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
						estudiante.getCedula(), estudiante.getFacultad() });
	}

	@Override
	public Estudiante buscarEstudiante(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void eliminarEstudiante(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, cedula=?, facultad=? where id=?",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(), estudiante.getCedula(),
						estudiante.getFacultad(),estudiante.getId() });
	}

}
