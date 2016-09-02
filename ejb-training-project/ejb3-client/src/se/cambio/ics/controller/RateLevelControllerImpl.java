package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.service.RateLevelService;

public class RateLevelControllerImpl extends GenericDelegate<RateLevel> implements RateLevelController {

	private RateLevelService service;

    public RateLevelControllerImpl(){

        String beanName = "RateLevelServiceImpl";
        String viewClassName = "se.cambio.ics.service.RateLevelService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (RateLevelService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }
    
	@Override
	public RateLevel getRatingLevel(short rateLevelId) throws Exception {

            return service.getRateLevel(rateLevelId);
    
	}

	@Override
	public List<RateLevel> viewAllRateLevels() throws Exception {
	
            return service.viewAllRateLevels();
      
	}

	@Override
	public void addRateLevel(RateLevel rateLevel) throws Exception {
		
            service.addRateLevel(rateLevel);
       
		
	}

	@Override
	public void deleteRateLevel(short rateLevelId) throws Exception {
		
            service.deleteRateLevel(rateLevelId);
        
		
	}

	@Override
	public void modifyRateLevel(RateLevel rateLevel) throws Exception {
		
            service.modifyRateLevel(rateLevel);
       
		
	}


}
