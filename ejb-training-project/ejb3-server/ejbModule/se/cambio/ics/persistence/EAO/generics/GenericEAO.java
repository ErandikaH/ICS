package se.cambio.ics.persistence.EAO.generics;

import java.io.Serializable;
import java.util.List;

import javax.persistence.PersistenceException;

public interface GenericEAO<T extends Serializable> {

	public void create(final T t) throws PersistenceException;

	public void update(final T t) throws PersistenceException;

	public void delete(final T t) throws PersistenceException;
	
	public T findById(final long id) throws PersistenceException;
	
	public List<T> findAll() throws PersistenceException;
	
	public void setEntityClass(Class<T> classToSet) throws PersistenceException;

}
