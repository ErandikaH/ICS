package se.cambio.ics.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class AddVendorRateAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String vendorName;
	private String rateType;
	private String rateLevel;
	private String remark;
	private String dummyMsg;
	private String errorMsg;
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getRateLevel() {
		return rateLevel;
	}
	public void setRateLevel(String rateLevel) {
		this.rateLevel = rateLevel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
		
		VendorControllerImpl vendorCon=new VendorControllerImpl();
		RateLevelControllerImpl rateLevelCon=new RateLevelControllerImpl();
		RateTypeControllerImpl rateTypeCon=new RateTypeControllerImpl();
		VendorRateTypeControllerImpl vendorRateTypeCon=new VendorRateTypeControllerImpl();
		//HttpServletRequest req = ServletActionContext.getRequest();
		
		VendorRateType vendorRateType=new VendorRateType();
		
//		String date=req.getParameter("date");
//		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date currentDate = new Date();
	
//		try {
//			currentDate= format.parse(date);
//		} catch (ParseException e2) {
//			e2.printStackTrace();
//			return ERROR;
//			
//		}
		vendorRateType.setDate(currentDate);
	
		//String vendorName=req.getParameter("selectedVendorName");
		Vendor vendor=null;
		try {
			vendor=vendorCon.getVendor(vendorName);
			
		} catch (Exception e1) {
			//e1.printStackTrace();
			java.util.logging.Logger.getLogger(AddVendorRateAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}
		vendorRateType.setVendor(vendor);
		
		RateType rt=null;
		try {
			short rateTypeId=Short.parseShort(rateType);
			rt=rateTypeCon.getRateType(rateTypeId);
			
		} catch (Exception e1) {
			errorMsg="$";
			dummyMsg = "Added Failed:"+e1.getMessage();
			//java.util.logging.Logger.getLogger(AddVendorRateAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}
		vendorRateType.setRateType(rt);
		
		RateLevel rl=null;
		try {
			short rateLevelId=Short.parseShort(rateLevel);
			rl=rateLevelCon.getRatingLevel(rateLevelId);
			
		} catch (Exception e1) {
			errorMsg="$";
			dummyMsg = "Added Failed:"+e1.getMessage();
			//java.util.logging.Logger.getLogger(AddVendorRateAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}
		vendorRateType.setRateLevel(rl);
		
		//String remark=req.getParameter("remark");
		
		vendorRateType.setRemarks(remark);
		
		try {
			vendorRateTypeCon.addVendorRateType(vendorRateType);
			dummyMsg="Added Successfully!";
			return SUCCESS;
		} catch (Exception e) {
			errorMsg="$";
			dummyMsg = "Added Failed:"+e.getMessage();
			//java.util.logging.Logger.getLogger(AddVendorRateAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			return ERROR;
		}
		
	}


}
