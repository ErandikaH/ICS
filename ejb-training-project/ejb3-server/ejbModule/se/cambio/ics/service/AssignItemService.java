/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.AssignItem;

/**
 *
 * @author PC
 */
@Remote
public interface AssignItemService {
    
    public AssignItem getAssignItem(long assignItemId);
    
    public List<AssignItem> getAllAssignItems();

    public List<AssignItem> getAssignItemByUserId(int userId);
    
    public List<AssignItem> getAssignItemByItemId(long itemId);

    public void addAssignItem(AssignItem assignItem);

    public void deleteAssignItem(long assignItemId);

    public void modifyAssignItem(AssignItem assignItem);
    
}
