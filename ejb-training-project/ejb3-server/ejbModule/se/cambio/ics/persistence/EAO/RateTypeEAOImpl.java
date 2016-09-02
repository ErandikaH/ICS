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

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class RateTypeEAOImpl extends AbstractGenericEAO<RateType>implements RateTypeEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public RateType getRateType(short rateTypeId) throws Exception {
        RateType en = null;
        
        Query query = entityManager.createQuery(
                        "select r from RateType r where r.id =(:id)",
                        RateType.class);
        query.setParameter("id", rateTypeId);
        en = (RateType) query.getSingleResult();

        return en;
    }

	@Override
	public List<RateType> getAllRateTypeList() throws Exception {
		Query query = entityManager.createQuery(
                "select r from RateType r",
                RateType.class);
    	
    	return (List<RateType>) query.getResultList();
	}
 
}
