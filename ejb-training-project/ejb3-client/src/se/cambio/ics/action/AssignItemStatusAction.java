package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.AssignedItemStatusControllerImpl;
import se.cambio.ics.persistence.AssignedItemStatus;

import com.opensymphony.xwork2.ActionSupport;

public class AssignItemStatusAction extends ActionSupport {
	
private static final long serialVersionUID = 1L;
	
	private List<AssignedItemStatus> status=new ArrayList<AssignedItemStatus>();
	private HashMap<String,String> aaData=new HashMap<String,String>(); 
  
	public List<AssignedItemStatus> getStatus() {
		return status;
	}
	public void setStatus(List<AssignedItemStatus> status) {
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
    	
		AssignedItemStatusControllerImpl assignedItemStatusControllerImpl=new AssignedItemStatusControllerImpl();
		aaData.put("0","Select Status");
    	try {
    		status=assignedItemStatusControllerImpl.getAssignedItemStatusList();
			
			for(AssignedItemStatus s:status){
	    		
	    		aaData.put(Short.toString(s.getId()), s.getStatusName());
	    	}
	   
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(AssignItemStatusAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }


}
