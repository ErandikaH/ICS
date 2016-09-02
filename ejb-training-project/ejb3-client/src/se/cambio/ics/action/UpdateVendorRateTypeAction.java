package se.cambio.ics.action;

import java.util.Date;

import se.cambio.ics.controller.RateLevelControllerImpl;
import se.cambio.ics.controller.RateTypeControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.RateLevel;
import se.cambio.ics.persistence.RateType;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateVendorRateTypeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String rateId;
	private String rateType;
	private String rateLevel;
	private String vendorName;
	private String remark;
	private String dummyMsg;
	
	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
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
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
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
	
	@Override
	public String execute() {
		
		RateLevelControllerImpl rateLevelCon=new RateLevelControllerImpl();
		RateTypeControllerImpl rateTypeCon=new RateTypeControllerImpl();
		VendorControllerImpl vendorControllerImpl=new VendorControllerImpl();
		VendorRateTypeControllerImpl vendorRateTypeCon=new VendorRateTypeControllerImpl();
	
		VendorRateType vendorRateType=new VendorRateType();
		

		Date currentDate = new Date();
		vendorRateType.setDate(currentDate);
	
		
		if(rateId!=null){
			
			int vendorRateId=Integer.parseInt(rateId);
			vendorRateType.setId(vendorRateId);
	
			try {
				vendorRateType.setVersion(vendorRateTypeCon.getVendorRateType(vendorRateId).getVersion());
			} catch (Exception e2) {
				java.util.logging.Logger.getLogger(UpdateVendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e2);
				return ERROR;
			}
			Vendor v=null;
			try{
				v=vendorControllerImpl.getVendor(vendorName);
			}catch (Exception e1) {
				java.util.logging.Logger.getLogger(UpdateVendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				return ERROR;
			}
			vendorRateType.setVendor(v);
			
			RateType rt=null;
			try {
				short ratetypeId=Short.parseShort(rateType);
				rt=rateTypeCon.getRateType(ratetypeId);
				
			} catch (Exception e1) {
				java.util.logging.Logger.getLogger(UpdateVendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				return ERROR;
			}
			vendorRateType.setRateType(rt);
			
			RateLevel rl=null;
			try {
				short ratelevelId=Short.parseShort(rateLevel);
				rl=rateLevelCon.getRatingLevel(ratelevelId);
				
			} catch (Exception e1) {
				java.util.logging.Logger.getLogger(UpdateVendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
				return ERROR;
			}
			vendorRateType.setRateLevel(rl);
			
			vendorRateType.setRemarks(remark);
			
			try {
				vendorRateTypeCon.modifyVendorRateType(vendorRateType);
				dummyMsg="Updated Successfully!";
				return SUCCESS;
			} catch (Exception e) {	
				dummyMsg = "Update failed. :" + e.getMessage(); 
				java.util.logging.Logger.getLogger(UpdateVendorRateTypeAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
				return ERROR;
			}

		}
		return ERROR;

	}
	
	
//	@Override
//	public String execute() {
//		
//		HttpServletRequest req = ServletActionContext.getRequest();
//		
//		VendorControllerImpl vendorCon=new VendorControllerImpl();
//		RateLevelControllerImpl rateLevelCon=new RateLevelControllerImpl();
//		RateTypeControllerImpl rateTypeCon=new RateTypeControllerImpl();
//		VendorRateTypeControllerImpl vendorRateTypeCon=new VendorRateTypeControllerImpl();
//		
//		VendorRateType vendorRateType=new VendorRateType();
//		//System.out.println(req.getParameter("rateIdE"));
//		int vendorRateTypeId=Integer.parseInt(req.getParameter("rateId"));
//		vendorRateType.setId(vendorRateTypeId);
//		
//		Date currentDate = new Date();
//		vendorRateType.setDate(currentDate);
//	
//		String vendorName=req.getParameter("selectedVendorName");
//		//int vendorId=Integer.parseInt(vendorName);
//				
//		Vendor vendor=null;
//		try {
//			//vendor=vendorCon.getVendor(vendorId);
//			vendor=vendorCon.getVendor(vendorName);
//			
//		} catch (Exception e1) {
//			e1.printStackTrace();
//			return ERROR;
//		}
//		vendorRateType.setVendor(vendor);
//		
//		RateType rateType=null;
//		try {
//			rateType=rateTypeCon.getRateType(req.getParameter("selectedRateTypeName"));
//			
//		} catch (Exception e1) {
//			e1.printStackTrace();
//			return ERROR;
//		}
//		vendorRateType.setRateType(rateType);
//		
//		RateLevel rateLevel=null;
//		try {
//			rateLevel=rateLevelCon.getRateLevel(req.getParameter("selectedRateLevelName"));
//			
//		} catch (Exception e1) {
//			e1.printStackTrace();
//			return ERROR;
//		}
//		vendorRateType.setRateLevel(rateLevel);
//		
//		String remark=req.getParameter("remark");
//		
//		vendorRateType.setRemarks(remark);
//		
//		try {
//			vendorRateTypeCon.modifyVendorRateType(vendorRateType);
//			return SUCCESS;
//		} catch (Exception e) {	
//			e.printStackTrace();
//			return ERROR;
//		}
//		
//	}


}
