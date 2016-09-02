package se.cambio.ics.persistence.EAO;

import java.util.List;

import javax.ejb.Remote;

import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

@Remote
public interface RateLevelEAO extends GenericEAO<RateLevel>{
    
    public RateLevel getRatingLevel(short ratingLevelId) throws Exception;
    
    public List<RateLevel> viewAllRatingLevels()throws Exception;
    
}