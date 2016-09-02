package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.RateLevel;

public interface RateLevelController {
	
	public RateLevel getRatingLevel(short rateLevelId) throws Exception;
    
    public List<RateLevel> viewAllRateLevels()throws Exception;

    public void addRateLevel(RateLevel rateLevel) throws Exception;

    public void deleteRateLevel(short rateLevelId) throws Exception;

    public void modifyRateLevel(RateLevel rateLevel) throws Exception;

}
