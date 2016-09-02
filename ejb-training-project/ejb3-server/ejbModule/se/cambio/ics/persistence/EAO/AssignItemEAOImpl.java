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

import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class AssignItemEAOImpl extends AbstractGenericEAO<AssignItem>implements AssignItemEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public AssignItem getAssignItem(long assignItemId) {
        AssignItem en = null;
        
        Query query = entityManager.createQuery(
                        "select r from AssignItem r where r.id =(:id)",
                        AssignItem.class);
        query.setParameter("id", assignItemId);
        en = (AssignItem) query.getSingleResult();

        return en;
    }

    @Override
    public List<AssignItem> getAllAssignItems() {
    	Query query = entityManager.createQuery(
                "select r from AssignItem r",
                AssignItem.class);
    	
    	return (List<AssignItem>) query.getResultList();
    }

    @Override
    public List<AssignItem> getAssignItemByUserId(int userId){
       // AssignItem en = null;
        
        Query query = entityManager.createQuery(
                        "select r from AssignItem r JOIN r.user u where u.userId =(:id)",
                        AssignItem.class);
        query.setParameter("id", userId);
        return (List<AssignItem>) query.getResultList();
        
    }

	@Override
	public List<AssignItem> getAssignItemByItemId(long itemId) {
		Query query = entityManager.createQuery(
                "select r from AssignItem r JOIN r.item u where u.id =(:id)",
                AssignItem.class);
				query.setParameter("id", itemId);
				return (List<AssignItem>) query.getResultList();
	}
    
}
