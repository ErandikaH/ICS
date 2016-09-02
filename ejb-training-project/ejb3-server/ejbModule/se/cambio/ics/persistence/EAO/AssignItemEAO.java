/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface AssignItemEAO extends GenericEAO<AssignItem>{
    
    public AssignItem getAssignItem(long assignItemId);
    
    public List<AssignItem> getAllAssignItems();

    public List<AssignItem> getAssignItemByUserId(int userId);
    
    public List<AssignItem> getAssignItemByItemId(long itemId);
    
}
