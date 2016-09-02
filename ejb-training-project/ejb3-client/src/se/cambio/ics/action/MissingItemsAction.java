package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.StatusControllerImpl;
import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.model.MissingDetails;
import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Status;

import com.opensymphony.xwork2.ActionSupport;

public class MissingItemsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StatusControllerImpl statusController=null;
	
	private AssignItemControllerImpl assignItemController=null;
	
	ArrayList<Status> statusList=new ArrayList<Status>();
	
	ArrayList<AssignItem> assignItemList=new ArrayList<AssignItem>();
	
	List<AssignItem> missingItemList=new ArrayList<AssignItem>();
	
	ArrayList<Short> missingStatusId=new ArrayList<Short>();
	
	ArrayList<MissingDetails> details=new ArrayList<MissingDetails>();
	
	public ArrayList<MissingDetails> getDetails() {
		return details;
	}

	public void setDetails(ArrayList<MissingDetails> details) {
		this.details = details;
	}


	@Override
	public String execute() {
		
		statusController=new StatusControllerImpl();
		assignItemController=new AssignItemControllerImpl();
		
		
		//get missing status ID
		try {
			statusList=(ArrayList<Status>) statusController.getAllStatusList();
			
			for(Status status:statusList){
				if(status.getStatusName().equals("missing")){
					missingStatusId.add(status.getId());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		//get Missing Item list
		try {
			assignItemList=(ArrayList<AssignItem>) assignItemController.getAllAssignItems();
			for(AssignItem assignItem:assignItemList){
				
				if(assignItem.getAssignItemStatusId().getId()==missingStatusId.get(0)){
				
					missingItemList.add(assignItem);
				}
				
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}
		
		UserControllerImpl user=new UserControllerImpl();
		ItemControllerImpl item=new ItemControllerImpl();
		
		MissingDetails md=null;
		
		for(AssignItem assignItem:missingItemList){
			md=new MissingDetails();
			md.setUserId(assignItem.getUser().getUserId());
			try {
				md.setFirstName(user.getUserById(assignItem.getUser().getUserId()).getFirstName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
			md.setItemId(assignItem.getItem().getId());
			try {
				md.setAssetNo(item.getItemEntity(assignItem.getItem().getId()).getAssetNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
			
			details.add(md);
			
		}

		return SUCCESS;
		
	}
	

}
