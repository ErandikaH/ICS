/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.EAO.AssignedItemStatusEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class AssignedItemStatusManagerBean implements AssignedItemStatusManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    AssignedItemStatusEAO assignedItemStatusDAO;
	
    public AssignedItemStatusManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception {
        return assignedItemStatusDAO.getAssignedItemStatus(assignedItemStatusId);
    }

    @Override
    public void addAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception {
        assignedItemStatusDAO.create(assignedItemStatus);
    }

     
    @Override
    public void removeAssignedItemStatus(short assignedItemStatusId) throws Exception {
        AssignedItemStatus ais=new AssignedItemStatus();
        ais.setId(assignedItemStatusId);
        assignedItemStatusDAO.delete(ais);
    }

    @Override
    public void updateAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception {
        assignedItemStatusDAO.update(assignedItemStatus);
    }

    @Override
    public List<AssignedItemStatus> getAssignedItemStatusList() throws Exception {
        return assignedItemStatusDAO.getAssignedItemStatusList();
    }
   
    @Override
    public AssignedItemStatus getAssignedItemStatus(String statusName) throws Exception{
    	return assignedItemStatusDAO.getAssignedItemStatus(statusName);
    }
}
