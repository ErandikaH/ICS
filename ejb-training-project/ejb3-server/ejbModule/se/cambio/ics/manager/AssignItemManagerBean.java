/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.EAO.AssignItemEAO;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class AssignItemManagerBean implements AssignItemManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    AssignItemEAO assignItemDAO;
	
    public AssignItemManagerBean() {
        // TODO Auto-generated constructor stub
    }

     @Override
    public AssignItem getAssignItem(long assignItemId){
        return assignItemDAO.getAssignItem(assignItemId);
    }

    @Override
    public void addAssignItem(AssignItem assignItem)  {
        assignItemDAO.create(assignItem);
    }

    @Override
    public void removeAssignItem(long assignItemId){
        AssignItem item=new AssignItem();
        item.setId(assignItemId);
        assignItemDAO.delete(item);
    }


    @Override
    public void updateAssignItem(AssignItem assignItem) {
        assignItemDAO.update(assignItem);
    }

    @Override
    public List<AssignItem> getAllAssignItems()  {
        return assignItemDAO.getAllAssignItems();
    }

    @Override
    public List<AssignItem> getAssignItemByUserId(int userId) {
        return assignItemDAO.getAssignItemByUserId(userId);
    }

	@Override
	public List<AssignItem> getAssignItemByItemId(long itemId) {
		return assignItemDAO.getAssignItemByItemId(itemId);
	}  
    
}
