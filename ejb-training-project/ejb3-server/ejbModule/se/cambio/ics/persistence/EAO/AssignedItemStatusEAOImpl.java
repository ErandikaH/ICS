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

import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class AssignedItemStatusEAOImpl extends AbstractGenericEAO<AssignedItemStatus>implements AssignedItemStatusEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception {
        AssignedItemStatus en = null;
        
        Query query = entityManager.createQuery(
                        "select r from AssignedItemStatus r where r.id =(:id)",
                        AssignedItemStatus.class);
        query.setParameter("id", assignedItemStatusId);
        en = (AssignedItemStatus) query.getSingleResult();

        return en;
    }

    @Override
    public List<AssignedItemStatus> getAssignedItemStatusList() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from AssignedItemStatus r",
                AssignedItemStatus.class);
    	
    	return (List<AssignedItemStatus>) query.getResultList();
    }

	@Override
	public AssignedItemStatus getAssignedItemStatus(String statusName)
			throws Exception {
		AssignedItemStatus en = null;
        
        Query query = entityManager.createQuery(
                        "select r from AssignedItemStatus r where r.statusName =(:statusName)",
                        AssignedItemStatus.class);
        query.setParameter("statusName", statusName);
        en = (AssignedItemStatus) query.getSingleResult();

        return en;
	}
    
}
