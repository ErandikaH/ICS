package se.cambio.ics.service;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.RateLevel;

@Remote
public interface RateLevelService {
	
	public RateLevel getRateLevel(short rateLevelId) throws Exception;
    
    public List<RateLevel> viewAllRateLevels()throws Exception;

    public void addRateLevel(RateLevel rateLevel) throws Exception;

    public void deleteRateLevel(short rateLevelId) throws Exception;

    public void modifyRateLevel(RateLevel rateLevel) throws Exception;

}
