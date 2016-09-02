/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.AssignItemManager;
import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class AssignItemServiceImpl
 */

@Stateless
public class AssignItemServiceImpl implements AssignItemService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    AssignItemManager assignItemService;
    
    @Override
    public AssignItem getAssignItem(long assignItemId) {
        try {
            return assignItemService.getAssignItem(assignItemId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(AssignItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public List<AssignItem> getAllAssignItems(){
        try {
            return assignItemService.getAllAssignItems();
        } catch (Exception e) {
            return (List<AssignItem>) e;
        }
       
    }

    @Override
    public List<AssignItem> getAssignItemByUserId(int userId) {
        try {
            return assignItemService.getAssignItemByUserId(userId);
        } catch (Exception e) {
            return (List<AssignItem>) e;
        }
       
    }

    @Override
    public void addAssignItem(AssignItem assignItem) {
        try {
            assignItemService.addAssignItem(assignItem);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "AssignItem can not be added. ");
        	java.util.logging.Logger.getLogger(AssignItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);

        }
    }

    @Override
    public void deleteAssignItem(long assignItemId){
        try {
            assignItemService.removeAssignItem(assignItemId);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "AssignItem can not be deleted.");
        	java.util.logging.Logger.getLogger(AssignItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void modifyAssignItem(AssignItem assignItem)  {
        try {
            assignItemService.updateAssignItem(assignItem);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "AssignItem can not be updated.");
        	java.util.logging.Logger.getLogger(AssignItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

	@Override
	public List<AssignItem> getAssignItemByItemId(long itemId) {
		try {
            return assignItemService.getAssignItemByItemId(itemId);
        } catch (Exception e) {
            return (List<AssignItem>) e;
        }
	}
    
}
