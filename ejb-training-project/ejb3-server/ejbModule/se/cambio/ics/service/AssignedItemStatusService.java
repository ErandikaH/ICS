/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.AssignedItemStatus;

/**
 *
 * @author PC
 */
@Remote
public interface AssignedItemStatusService {
    
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception;
    
    public AssignedItemStatus getAssignedItemStatus(String statusName) throws Exception;
    
    public List<AssignedItemStatus> getAssignedItemStatusList()throws Exception;

    public void addAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception;

    public void deleteAssignedItemStatus(short assignedItemStatusId) throws Exception;

    public void modifyAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception;
    
}
