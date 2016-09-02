package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.persistence.RateLevel;

import com.opensymphony.xwork2.ActionSupport;

public class RateLevelAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<RateLevel> rateLevelList=new ArrayList<RateLevel>();
	//List<String> aaData=new ArrayList<String>();
	HashMap<String,String> aaData=new HashMap<String,String>();  
	
	public List<RateLevel> getRateLevelList() {
		return rateLevelList;
	}
	public void setRateLevelList(List<RateLevel> rateLevelList) {
		this.rateLevelList = rateLevelList;
	}
	
	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    	
		RateLevelControllerImpl rateLevelControllerImpl=new RateLevelControllerImpl();
		aaData.put("0","Select Rate Level");
    	try {
    		rateLevelList=rateLevelControllerImpl.viewAllRateLevels();
    		
    		for(RateLevel r:rateLevelList){
    			aaData.put(Short.toString(r.getId()), r.getRateLevelName());
    		}
    		
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(RateLevelAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }

}
