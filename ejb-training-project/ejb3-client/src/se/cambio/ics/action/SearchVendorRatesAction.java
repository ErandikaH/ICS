package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class SearchVendorRatesAction extends ActionSupport {
	
private static final long serialVersionUID = 1L;
	
	private List<VendorRateType> aaData=new ArrayList<VendorRateType>();
	
	private String vendorName;

	public List<VendorRateType> getAaData() {
		return aaData;
	}

	public void setAaData(List<VendorRateType> aaData) {
		this.aaData = aaData;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public String execute() {
		
		VendorRateTypeControllerImpl vendorRate=new VendorRateTypeControllerImpl();
		VendorControllerImpl vendorController=new VendorControllerImpl();
		
		if(vendorName!=null){
			
			//System.out.println(vendorName);
			int vendorId = 0;
			try {
				vendorId = vendorController.getVendor(vendorName).getId();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//java.util.logging.Logger.getLogger(SearchVendorRatesAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
				System.out.println("No such vendors");
			}
			
			try {
				aaData=vendorRate.getVendorRateTypeByVendorId(vendorId);
				for(VendorRateType v:aaData){
					System.out.println(v.getDate());
				}
				
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchVendorRatesAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
		
//			for(VendorRateType v:aaData){
//				System.out.println(v.getDate());
//			}
		}else{
			
			try {
	
				aaData=vendorRate.getAllVendorRateType();
				
			} catch (Exception e1) {
		
				java.util.logging.Logger.getLogger(SearchVendorRatesAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				//return ERROR;}
			}
			
		//return null;
		
		
		}
		return SUCCESS;
	}

}
