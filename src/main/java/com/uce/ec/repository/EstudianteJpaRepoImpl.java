package com.uce.ec.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.ec.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteJpaRepoImpl implements IEstudianteJpaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarEstudiante(id));
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public Estudiante buscarEstudianteCedulaTyped(String cedula) {
		// TODO Auto-generated method stub

		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.cedula = :valoruno", Estudiante.class);
		myTypedQuery.setParameter("valoruno", cedula);

		return myTypedQuery.getSingleResult();

	}

	@Override
	public Estudiante buscarEstudianteCedulaApellidoTyped(String cedula, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(
				"select e from Estudiante e where e.cedula = :valoruno AND e.apellido = :valordos", Estudiante.class);
		myTypedQuery.setParameter("valoruno", cedula);
		myTypedQuery.setParameter("valordos", apellido);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarEstudianteNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarNombreApellidoNamed");
		myQuery.setParameter("valoruno", nombre);
		myQuery.setParameter("valordos", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarEstudianteFacultadNamed(String facultad) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarFacultadNamed");
		myQuery.setParameter("valoruno", facultad);
		return myQuery.getResultList();

	}

	@Override
	public List<Estudiante> buscarEstudianteFacultadNombreApellidoNamedTyped(String facultad, String nombre,
			String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarFacultadNombreApellidoTypedNamed", Estudiante.class);
		myQuery.setParameter("valoruno", facultad);
		myQuery.setParameter("valordos", nombre);
		myQuery.setParameter("valor", apellido);

		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarEstudianteCedulaFacultadNamedTyped(String cedula, String facultad) {
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarCedulaFacultadTypedNamed", Estudiante.class);
		myQuery.setParameter("valoruno", cedula);
		myQuery.setParameter("valordos", facultad);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCedulaApellidoNative(String cedula, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"select * from estudiante where cedula =:valoruno AND apellido =:valordos", Estudiante.class);
		myQuery.setParameter("valoruno", cedula);
		myQuery.setParameter("valordos", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarApellidoFacultadNative(String apellido, String facultad) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"select * from estudiante where apellido =:valoruno AND facultad =:valordos", Estudiante.class);
		myQuery.setParameter("valoruno", apellido);
		myQuery.setParameter("valordos", facultad);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCedulaNativeNamed",
				Estudiante.class);
		myQuery.setParameter("valoruno", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarNombreApellidoNamedNative(String nombre, String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorNombreApellidoNativeNamed", Estudiante.class);
		myQuery.setParameter("valoruno", nombre);
		myQuery.setParameter("valordos", apellido);
		return myQuery.getResultList();
	}

}
