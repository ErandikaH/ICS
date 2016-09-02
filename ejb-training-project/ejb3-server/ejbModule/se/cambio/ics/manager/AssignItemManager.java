/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.AssignItem;

/**
 *
 * @author PC
 */
public interface AssignItemManager {
    
    public AssignItem getAssignItem(long assignItemId) ;
    
    public List<AssignItem> getAllAssignItems();

    public List<AssignItem> getAssignItemByUserId(int userId);
    
    public List<AssignItem> getAssignItemByItemId(long itemId);

    public void addAssignItem(AssignItem assignItem);

    public void removeAssignItem(long assignItemId) ;

    public void updateAssignItem(AssignItem assignItem) ;
    
}
