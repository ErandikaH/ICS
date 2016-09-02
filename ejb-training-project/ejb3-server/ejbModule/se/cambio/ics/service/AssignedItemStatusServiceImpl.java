/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.AssignedItemStatusManager;
import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class AssignedItemStatusFacadeImpl
 */

@Stateless
public class AssignedItemStatusServiceImpl implements AssignedItemStatusService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    AssignedItemStatusManager assignedItemStatusService;

    @Override
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception {
        try {
            return assignedItemStatusService.getAssignedItemStatus(assignedItemStatusId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AssignedItemStatus> getAssignedItemStatusList() throws Exception {
        try {
            return assignedItemStatusService.getAssignedItemStatusList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception {
        try {
            assignedItemStatusService.addAssignedItemStatus(assignedItemStatus);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "AssignedItemStatus can not be added. ");
        }
    }

    @Override
    public void deleteAssignedItemStatus(short assignedItemStatusId) throws Exception {
        try {
            assignedItemStatusService.removeAssignedItemStatus(assignedItemStatusId);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "AssignedItemStatus can not be deleted.");
        }
    }

    @Override
    public void modifyAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception {
        try {
            assignedItemStatusService.updateAssignedItemStatus(assignedItemStatus);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "AssignedItemStatus can not be updated.");
        }
    }

	@Override
	public AssignedItemStatus getAssignedItemStatus(String statusName)
			throws Exception {
		try {
            return assignedItemStatusService.getAssignedItemStatus(statusName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
    
}
