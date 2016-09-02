/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.AssignItem;

/**
 *
 * @author PC
 */
public interface AssignItemController {
    
    public AssignItem getAssignItem(long assignItemId) ;
    
    public List<AssignItem> getAllAssignItems();

    public List<AssignItem> getAssignItemByUserId(int userId);
    
    public List<AssignItem> getAssignItemByItemId(long itemId);

    public void addAssignItem(AssignItem assignItem);

    public void deleteAssignItem(long assignItemId);

    public void modifyAssignItem(AssignItem assignItem);
    
}
