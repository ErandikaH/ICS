/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface AssignedItemStatusEAO extends GenericEAO<AssignedItemStatus>{
    
    public AssignedItemStatus getAssignedItemStatus(short assignedItemStatusId) throws Exception;
    
    public AssignedItemStatus getAssignedItemStatus(String statusName) throws Exception;
    
    public List<AssignedItemStatus> getAssignedItemStatusList()throws Exception;

}
