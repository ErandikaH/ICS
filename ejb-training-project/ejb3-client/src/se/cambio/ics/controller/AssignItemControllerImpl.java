package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.service.AssignItemService;

public class AssignItemControllerImpl extends GenericDelegate<AssignItem>
		implements AssignItemController {

	private AssignItemService service;
	
    public AssignItemControllerImpl(){
			
            String beanName = "AssignItemServiceImpl";
            String viewClassName = "se.cambio.ics.service.AssignItemService";

            setBeanName(beanName);
            setViewClassName(viewClassName);

            try {
                    service = (AssignItemService) lookupRemoteBean();
            } catch (NamingException e) {
                    // TODO Auto-generated catch block
                    System.out.println("errrrorrrrr");
                    java.util.logging.Logger.getLogger(AssignItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            }
    }

    @Override
    public AssignItem getAssignItem(long assignItemId){
    	return service.getAssignItem(assignItemId);
       
    }

    @Override
    public List<AssignItem> getAllAssignItems(){
        return service.getAllAssignItems();
    }

    @Override
    public List<AssignItem> getAssignItemByUserId(int userId){
        return service.getAssignItemByUserId(userId);
    }

    @Override
    public void addAssignItem(AssignItem assignItem) {
        try{
            service.addAssignItem(assignItem);
        }catch(Exception e){
        	java.util.logging.Logger.getLogger(AssignItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void deleteAssignItem(long assignItemId) {
        service.deleteAssignItem(assignItemId);
    }

    @Override
    public void modifyAssignItem(AssignItem assignItem){
        service.modifyAssignItem(assignItem);
    }

	@Override
	public List<AssignItem> getAssignItemByItemId(long itemId) {
		return service.getAssignItemByItemId(itemId);
	}
}
