/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Status;
import se.cambio.ics.service.StatusService;

/**
 *
 * @author PC
 */
public class StatusControllerImpl extends GenericDelegate<Status> implements StatusController{

    private StatusService service;

    public StatusControllerImpl(){

        String beanName = "StatusServiceImpl";
        String viewClassName = "se.cambio.ics.service.StatusService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (StatusService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public Status getStatus(short statusId) throws Exception {
        try {
            return service.getStatus(statusId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Status> getAllStatusList() throws Exception {
        try {
            return service.getAllStatusList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addStatus(Status status) throws Exception {
        try {
            service.addStatus(status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStatus(short statusId) throws Exception {
        try {
            service.deleteStatus(statusId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyStatus(Status status) throws Exception {
        try {
            service.modifyStatus(status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public Status getStatus(String statusName) throws Exception {
		try {
            return service.getStatus(statusName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
	
    
}
