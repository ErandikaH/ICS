/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.Status;
import se.cambio.ics.persistence.EAO.StatusEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class StatusManagerBean implements StatusManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    StatusEAO statusDAO;
	
    public StatusManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Status getStatus(short statusId) throws Exception {
        return statusDAO.getStatus(statusId);
    }
    
    @Override
    public Status getStatus(String statusName) throws Exception {
        return statusDAO.getStatus(statusName);
    }


    @Override
    public void addStatus(Status status) throws Exception {
        statusDAO.create(status);
    }
    
    @Override
    public void removeStatus(short statusId) throws Exception {
        Status status=new Status();
        status.setId(statusId);
        statusDAO.delete(status);
    }

    @Override
    public void updateStatus(Status status) throws Exception {
        statusDAO.update(status);
    }

    @Override
    public List<Status> getAllStatusList() throws Exception {
        return statusDAO.getAllStatusList();
    }

    
}
