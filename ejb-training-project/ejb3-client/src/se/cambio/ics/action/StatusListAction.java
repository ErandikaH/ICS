package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.StatusControllerImpl;
import se.cambio.ics.persistence.Status;

import com.opensymphony.xwork2.ActionSupport;

public class StatusListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Status> status=new ArrayList<Status>();
	private HashMap<String,String> aaData=new HashMap<String,String>();  
    
    public List<Status> getStatus() {
		return status;
	}
	public void setStatus(List<Status> status) {
		this.status = status;
	}
	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    	
    	StatusControllerImpl statusControllerImpl=new StatusControllerImpl();
    	aaData.put("0","Select Status");
    	try {
			status=statusControllerImpl.getAllStatusList();
			
			for(Status s:status){
    			aaData.put(Short.toString(s.getId()), s.getStatusName());
    		}
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(StatusListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }

	    
}
