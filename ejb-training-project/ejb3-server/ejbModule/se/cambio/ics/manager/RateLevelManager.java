package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.RateLevel;

@Remote
public interface RateLevelManager {
	
	public RateLevel getRateLevel(short rateLevelId) throws Exception;
    
    public List<RateLevel> viewAllRateLevels()throws Exception;

    public void addRateLevel(RateLevel rateLevel) throws Exception;

    public void removeRateLevel(short rateLevelId) throws Exception;

    public void updateRateLevel(RateLevel rateLevel) throws Exception;

}
