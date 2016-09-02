/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

//import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class VendorRateTypeEAOImpl extends AbstractGenericEAO<VendorRateType>implements VendorRateTypeEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public VendorRateType getVendorRateType(int vendorRateTypeId)throws Exception{
        VendorRateType en = null;
        
        Query query = entityManager.createQuery(
                        "select r from VendorRateType r where r.id =(:id)",
                        VendorRateType.class);
        query.setParameter("id", vendorRateTypeId);
        en = (VendorRateType) query.getSingleResult();

        return en;
    }

	@Override
	public List<VendorRateType> getAllVendorRateType()throws Exception{
		Query query = entityManager.createQuery(
                "select r from VendorRateType r",
                VendorRateType.class);
    	
    	return (List<VendorRateType>) query.getResultList();
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByVendorId(int vendorId)throws Exception{
		Query query = entityManager.createQuery(
                "select r from VendorRateType r JOIN r.vendor v where v.id=(:vendorId) order by r.date desc limit 10");
		query.setParameter("vendorId", vendorId);
    	return (List<VendorRateType>) query.getResultList();
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateTypeId(short rateTypeId) throws Exception{
		Query query = entityManager.createQuery(
                "select r from VendorRateType r JOIN r.rateType v where v.id=(:rateTypeId)",
                VendorRateType.class);
		query.setParameter("rateTypeId", rateTypeId);
    	return (List<VendorRateType>) query.getResultList();
	}

	@Override
	public List<VendorRateType> getVendorRateTypeByRateLevelId(short rateLevelId) throws Exception{
		Query query = entityManager.createQuery(
                "select r from VendorRateType r JOIN r.rateLevel v where v.id=(:rateLevelId)",
                VendorRateType.class);
		query.setParameter("rateLevelId", rateLevelId);
    	return (List<VendorRateType>) query.getResultList();
	}

}
