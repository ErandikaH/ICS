package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.persistence.RateType;

import com.opensymphony.xwork2.ActionSupport;

public class RateTypeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<RateType> rateTypeList=new ArrayList<RateType>();
	HashMap<String,String> aaData=new HashMap<String,String>();  
	
	public List<RateType> getRateTypeList() {
		return rateTypeList;
	}
	public void setRateTypeList(List<RateType> rateTypeList) {
		this.rateTypeList = rateTypeList;
	}

	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    	
		RateTypeControllerImpl rateTypeController=new RateTypeControllerImpl();
		
    	aaData.put("0","Select Rate Type");
    	try {
    		rateTypeList=rateTypeController.getAllRateTypeList();
    		
    		for(RateType r:rateTypeList){
    			//aaData.put(r.getId(), r.getTypeName());
    			aaData.put(Short.toString(r.getId()), r.getTypeName());
    		}
    		
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(RateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }
}
