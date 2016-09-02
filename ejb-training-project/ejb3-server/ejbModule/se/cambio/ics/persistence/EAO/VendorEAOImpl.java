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

import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class VendorEAOImpl extends AbstractGenericEAO<Vendor>implements VendorEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Vendor getVendor(int vendorId) throws Exception{
        Vendor en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Vendor r where r.id =(:id)",
                        Vendor.class);
        query.setParameter("id", vendorId);
        en = (Vendor) query.getSingleResult();

        return en;
    }

    @Override
    public List<Vendor> getAllVendorsList() throws Exception{
    	Query query = entityManager.createQuery(
                "select r from Vendor r",
                Vendor.class);
    	
    	return (List<Vendor>) query.getResultList();
    }

	@Override
	public Vendor getVendor(String companyName)  throws Exception{
		Vendor en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Vendor r where r.companyName =(:companyName)",
                        Vendor.class);
        query.setParameter("companyName", companyName);
        en = (Vendor) query.getSingleResult();

        return en;
	}

	@Override
	public List<Vendor> getAllVendorsListByName(String companyName) throws Exception{
		Query query = entityManager.createQuery(
				"select r from Vendor r where r.companyName LIKE (:companyName)",
                Vendor.class);
		query.setParameter("companyName", companyName+"%");
    	
    	return (List<Vendor>) query.getResultList();
	}

}
