package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.AssignItem;

import com.opensymphony.xwork2.ActionSupport;

public class AssignItemAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AssignItem> aaData=new ArrayList<AssignItem>();	
	private String assetNo;

	public List<AssignItem> getAaData() {
		return aaData;
	}
	public void setAaData(List<AssignItem> aaData) {
		this.aaData = aaData;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	@Override
	public String execute() {
		
		AssignItemControllerImpl assignItemControllerImpl=new AssignItemControllerImpl();
		ItemControllerImpl itemControllerImpl=new ItemControllerImpl();
		
		if(assetNo!=null){
			
			//System.out.println(assetNo);
			long itemId = 0;
			try {
				itemId=itemControllerImpl.getItem(assetNo).getId();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//java.util.logging.Logger.getLogger(AssignItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
				System.out.println("No such vendors");
			}
			
			try {
				aaData=assignItemControllerImpl.getAssignItemByItemId(itemId);
				//aaData=assignItemControllerImpl.getAssignItem(itemId);
				
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(AssignItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
		
//			for(AssignItem v:aaData){
//				System.out.println(v.getAssignItemStatusId());
//			}
		}else{
			
			try {
				aaData=assignItemControllerImpl.getAllAssignItems();
				//aaData=vendorRate.getAllVendorRateType();
				
			} catch (Exception e1) {
		
				java.util.logging.Logger.getLogger(AssignItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;}
			}
			
		//return null;
		
		
		}
		return SUCCESS;
	}

}
