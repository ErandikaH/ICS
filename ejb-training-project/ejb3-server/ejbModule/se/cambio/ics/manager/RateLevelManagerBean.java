package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.EAO.RateLevelEAO;

/**
 * Session Bean implementation class RateLevelManagerBean
 */
@Stateless
public class RateLevelManagerBean implements RateLevelManager {

    /**
     * Default constructor. 
     */
	
	@EJB
    RateLevelEAO ratingLevelDAO;
	
    public RateLevelManagerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public RateLevel getRateLevel(short rateLevelId) throws Exception {
		return ratingLevelDAO.getRatingLevel(rateLevelId);
	}

	@Override
	public List<RateLevel> viewAllRateLevels() throws Exception {
		return ratingLevelDAO.viewAllRatingLevels();
	}

	@Override
	public void addRateLevel(RateLevel rateLevel) throws Exception {
		ratingLevelDAO.create(rateLevel);
		
	}

	@Override
	public void removeRateLevel(short rateLevelId) throws Exception {
		RateLevel ratingLevel = new RateLevel();
        ratingLevel.setId(rateLevelId);
        ratingLevelDAO.delete(ratingLevel);
		
		
	}

	@Override
	public void updateRateLevel(RateLevel rateLevel) throws Exception {
		ratingLevelDAO.update(rateLevel);
		
	}
	

}
