package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.service.AssignedItemStatusService;

public class AssignedItemStatusControllerImpl extends GenericDelegate<AssignedItemStatus> implements AssignedItemStatusController {
	

	private AssignedItemStatusService service;
	public AssignedItemStatusControllerImpl(){
		
        String beanName = "AssignedItemStatusServiceImpl";
        String viewClassName = "se.cambio.ics.service.AssignedItemStatusService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (AssignedItemStatusService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
	}


	@Override
	public List<AssignedItemStatus> getAssignedItemStatusList() throws Exception {
	    try {
	        return service.getAssignedItemStatusList();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	@Override
	public void addAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception{
	    try {
	        service.addAssignedItemStatus(assignedItemStatus);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	}
	
	@Override
	public void deleteAssignedItemStatus(short assignedItemStatusId) throws Exception {
	    try {
	        service.deleteAssignedItemStatus(assignedItemStatusId);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	@Override
	public void modifyAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception{
	    try {
	        service.modifyAssignedItemStatus(assignedItemStatus);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	@Override
	public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception{
	    try {
	        return service.getAssignedItemStatus(assignedItemStatusId);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}


	@Override
	public AssignedItemStatus getAssignedItemStatus(String statusName)
			throws Exception {
		try {
	        return service.getAssignedItemStatus(statusName);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
