/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.StatusManager;
import se.cambio.ics.persistence.Status;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;


/**
 * Session Bean implementation class StatusFacadeImpl
 */

@Stateless
public class StatusServiceImpl implements StatusService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    StatusManager statusService;

    @Override
    public Status getStatus(short statusId) throws Exception {
        try {
            return statusService.getStatus(statusId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Status> getAllStatusList() throws Exception {
        try {
            return statusService.getAllStatusList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addStatus(Status status) throws Exception {
        try {
            statusService.addStatus(status);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Status can not be added. ");
        }
    }

    @Override
    public void deleteStatus(short statusId) throws Exception {
        try {
            statusService.removeStatus(statusId);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Status can not be deleted.");
        }
    }

    @Override
    public void modifyStatus(Status status) throws Exception {
        try {
            statusService.updateStatus(status);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Status can not be updated.");
        }
    }

	@Override
	public Status getStatus(String statusName) throws Exception {
		try {
            return statusService.getStatus(statusName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
    
}
