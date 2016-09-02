package se.cambio.ics.persistence.EAO.generics;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;


public abstract class AbstractGenericEAO <T extends Serializable>{
	
	private Class<T> entityClass;
	
	@PersistenceContext(unitName = "EjbComponentPU")
	protected EntityManager entityManager;
	
	

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void setEntityClass(Class<T> classToSet)
			throws PersistenceException {
		this.entityClass=classToSet;
		
	}

	
	public void create(final T entity) throws PersistenceException {

		try{
		
		//this.entityManager.persist(entity);
		this.entityManager.merge(entity);
		this.entityManager.flush();
		this.entityManager.refresh(entity);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
		//entityManager

	}


	public void update(final T entity) throws PersistenceException {
		this.entityManager.merge(entity);
	}

	public void delete(final T obj) throws PersistenceException {

		this.entityManager.remove(entityManager.merge(obj));
		//this.entityManager.remove(obj);

	}

	public T findById(final long id) throws PersistenceException {
		return getEntityManager().find(entityClass, id);
	}


	public List<T> findAll() throws PersistenceException {
		return getEntityManager().createQuery("from " + entityClass.getName()).getResultList();
	}

	

}
