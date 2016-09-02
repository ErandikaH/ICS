package se.cambio.ics.action;


import se.cambio.ics.controller.ItemControllerImpl;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteItemAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String assetNo;
	private String dummyMsg;

	
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getDummyMsg() {
		return dummyMsg;
	}
	public void setDummyMsg(String dummyMsg) {
		this.dummyMsg = dummyMsg;
	}
	
	@Override
	public String execute() {
		
		ItemControllerImpl itemControllerImpl=new ItemControllerImpl();
		
		long itemId = 0;
		try {
			itemId=itemControllerImpl.getItem(assetNo).getId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//java.util.logging.Logger.getLogger(DeleteItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			System.out.println("No such items.");
		}
		
		try {
			itemControllerImpl.deleteItemEntity(itemId);
			dummyMsg = "Deleted Successfully.";
			return SUCCESS;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			dummyMsg = "Delete failed.";
			java.util.logging.Logger.getLogger(DeleteItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}

		
		
	}
}
