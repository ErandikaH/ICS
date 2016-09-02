/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class ManufacturerDetailsEAOImpl extends AbstractGenericEAO<ManufacturerDetails>implements ManufacturerDetailsEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }


    @Override
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception {
        ManufacturerDetails en = null;
        
        Query query = entityManager.createQuery(
                        "select r from ManufacturerDetails r where r.id =(:id)",
                        ManufacturerDetails.class);
        query.setParameter("id", manufacturerId);
        en = (ManufacturerDetails) query.getSingleResult();

        return en;
    }

    @Override
    public List<ManufacturerDetails> viewManufacturerDetailsList() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from ManufacturerDetails r",
                ManufacturerDetails.class);
    	
    	return (List<ManufacturerDetails>) query.getResultList();
    }

	@Override
	public ManufacturerDetails getManufacturerDetails(String model, String make) {
		ManufacturerDetails en = null;
        
        Query query = entityManager.createQuery(
                        "select r from ManufacturerDetails r where r.make =(:make) and r.model=(:model)",
                        ManufacturerDetails.class);
        query.setParameter("model", model);
        query.setParameter("make", make);
        en = (ManufacturerDetails) query.getSingleResult();

        return en;
	}
    
}
