package se.cambio.ics.action;

import se.cambio.ics.controller.VendorControllerImpl;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteVendorAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String vendorName;
	private String dummyMsg;
	private String errorMsg;
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getDummyMsg() {
		return dummyMsg;
	}
	public void setDummyMsg(String dummyMsg) {
		this.dummyMsg = dummyMsg;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String execute() {
		
		VendorControllerImpl vendorController=new VendorControllerImpl();
		
		int vendorId = 0;
		int version=0;
		try {
			vendorId = vendorController.getVendor(vendorName).getId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			dummyMsg = "Delete failed. :" + e.getMessage(); 
			//java.util.logging.Logger.getLogger(DeleteVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			//System.out.println("No such vendors");
		}
		
		try {
			version=vendorController.getVendor(vendorName).getVersion();
		} catch (Exception e) {
			dummyMsg = "Delete failed. :" + e.getMessage(); 
			java.util.logging.Logger.getLogger(DeleteVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		
		try {
			vendorController.deleteVendor(vendorId,version);
			dummyMsg = "Deleted Successfully.";
			return SUCCESS;
		} catch (Exception e1) {
			errorMsg="$";
			//dummyMsg=e1.toString(); //get exception name + reason
			dummyMsg = "Delete failed. :" + e1.getMessage(); //only reason
			//java.util.logging.Logger.getLogger(DeleteVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}

		
		
	}


}
