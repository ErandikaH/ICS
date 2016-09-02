/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
@Stateless
public class LocationEAOImpl extends AbstractGenericEAO<Location>implements LocationEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Location getLocation(int locationId){
        Location en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Location r where r.id =(:id)",
                        Location.class);
        query.setParameter("id", locationId);
        en = (Location) query.getSingleResult();

        return en;
    }

	@Override
	public List<Location> getAllLocations(){
		Query query = entityManager.createQuery(
                "select r from Location r",
                Location.class);
    	
    	return (List<Location>) query.getResultList();
	}

	@Override
	public List<Location> getAllLocations(int buildingNo) {
		Query query = entityManager.createQuery(
                "select r from Location r where r.buildingNumber =(:buildingNo)",
                Location.class);
		query.setParameter("buildingNo", buildingNo);
    	return (List<Location>) query.getResultList();
	}

	@Override
	public List<Location> getAllLocations(int buildingNo, int floor) {
		Query query = entityManager.createQuery(
                "select r from Location r where r.buildingNumber =(:buildingNo) and r.floor =(:floor)",
                Location.class);
		
		query.setParameter("buildingNo", buildingNo);
		query.setParameter("floor", floor);
    	return (List<Location>) query.getResultList();
	}

    
}
