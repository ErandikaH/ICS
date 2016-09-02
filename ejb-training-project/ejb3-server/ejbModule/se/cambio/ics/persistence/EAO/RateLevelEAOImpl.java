package se.cambio.ics.persistence.EAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 * Session Bean implementation class RateLevelEAOImpl
 */
@Stateless
public class RateLevelEAOImpl extends AbstractGenericEAO<RateLevel> implements RateLevelEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    /**
     * Default constructor. 
     */
    public RateLevelEAOImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RateLevel getRatingLevel(short ratingLevelId) throws Exception {
        RateLevel en = null;
        
        Query query = entityManager.createQuery(
                        "select r from RateLevel r where r.id =(:id)",
                        RateLevel.class);
        query.setParameter("id", ratingLevelId);
        en = (RateLevel) query.getSingleResult();

        return en;
    }

    @Override
    public List<RateLevel> viewAllRatingLevels() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from RateLevel r",
                RateLevel.class);
    	
    	return (List<RateLevel>) query.getResultList();
    }

}
