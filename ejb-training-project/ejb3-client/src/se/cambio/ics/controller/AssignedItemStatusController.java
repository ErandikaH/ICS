/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.AssignedItemStatus;

/**
 *
 * @author PC
 */
public interface AssignedItemStatusController {
    
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception;
    
    public AssignedItemStatus getAssignedItemStatus(String statusName) throws Exception;
    
    public List<AssignedItemStatus> getAssignedItemStatusList()throws Exception;

    public void addAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception;

    public void deleteAssignedItemStatus(short assignedItemStatusId) throws Exception;

    public void modifyAssignedItemStatus(AssignedItemStatus assignedItemStatus) throws Exception;
    
}
