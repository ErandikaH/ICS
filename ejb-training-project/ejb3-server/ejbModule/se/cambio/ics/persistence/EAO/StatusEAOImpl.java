/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.Status;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class StatusEAOImpl extends AbstractGenericEAO<Status>implements StatusEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Status getStatus(short statusId) throws Exception {
        Status en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Status r where r.id =(:id)",
                        Status.class);
        query.setParameter("id", statusId);
        en = (Status) query.getSingleResult();

        return en;
    }

    @Override
    public List<Status> getAllStatusList() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from Status r",
                Status.class);
    	
    	return (List<Status>) query.getResultList();
    }

	@Override
	public Status getStatus(String statusName) throws Exception {
		Status en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Status r where r.statusName =(:statusName)",
                        Status.class);
        query.setParameter("statusName", statusName);
        en = (Status) query.getSingleResult();

        return en;
	}

    
}
