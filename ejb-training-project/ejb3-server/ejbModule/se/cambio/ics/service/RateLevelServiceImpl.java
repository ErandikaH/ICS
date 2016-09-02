package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.RateLevelManager;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class RateLevelFacadeImpl
 */
@Stateless
public class RateLevelServiceImpl implements RateLevelService {

    /**
     * Default constructor. 
     */
	
	@EJB
    RateLevelManager ratingLevelService;
	
    public RateLevelServiceImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public RateLevel getRateLevel(short rateLevelId) throws Exception {
	
            return ratingLevelService.getRateLevel(rateLevelId);
       
	}

	@Override
	public List<RateLevel> viewAllRateLevels() throws Exception {
		
            return ratingLevelService.viewAllRateLevels();
        
	}

	@Override
	public void addRateLevel(RateLevel rateLevel) throws Exception {
		
            ratingLevelService.addRateLevel(rateLevel);
       
		
	}

	@Override
	public void deleteRateLevel(short rateLevelId) throws Exception {
		
            ratingLevelService.removeRateLevel(rateLevelId);
       
	}

	@Override
	public void modifyRateLevel(RateLevel rateLevel) throws Exception {
		
            ratingLevelService.updateRateLevel(rateLevel);
       
	}

}
