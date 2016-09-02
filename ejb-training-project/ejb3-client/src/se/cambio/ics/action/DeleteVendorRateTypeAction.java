package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteVendorRateTypeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
	
		VendorRateType vendorRateType=new VendorRateType();
		int vendorRateTypeId=Integer.parseInt(req.getParameter("rateId"));
		vendorRateType.setId(vendorRateTypeId);
	
		VendorRateTypeControllerImpl vendorRateTypeCon=new VendorRateTypeControllerImpl();
		
		try {
			vendorRateTypeCon.deleteVendorRateType(vendorRateTypeId);
			return SUCCESS;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}

		
		
	}


}
