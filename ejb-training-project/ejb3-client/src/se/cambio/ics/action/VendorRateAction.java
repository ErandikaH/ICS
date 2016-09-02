package se.cambio.ics.action;


import se.cambio.ics.controller.VendorRateTypeControllerImpl;
import se.cambio.ics.persistence.VendorRateType;

import com.opensymphony.xwork2.ActionSupport;

public class VendorRateAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rateId;
	private String rateTypeId;
	private String rateLevelId;
	private String remarks;
	

	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}
	public String getRateTypeId() {
		return rateTypeId;
	}
	public void setRateTypeId(String rateTypeId) {
		this.rateTypeId = rateTypeId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRateLevelId() {
		return rateLevelId;
	}
	public void setRateLevelId(String rateLevelId) {
		this.rateLevelId = rateLevelId;
	}
	@Override
	public String execute() {
		
		System.out.println("id1:"+rateId);
		if(rateId!=null){
			int vendorRateId=Integer.parseInt(rateId);
			
			VendorRateTypeControllerImpl vendorRateTypeCon=new VendorRateTypeControllerImpl();
			VendorRateType vrt;
			try{
				vrt=vendorRateTypeCon.getVendorRateType(vendorRateId);
				
				rateTypeId=Short.toString(vrt.getRateType().getId());
				rateLevelId=Short.toString(vrt.getRateLevel().getId());
				remarks=vrt.getRemarks();
				
//					System.out.println("id:"+rateId);
//					System.out.println("level:"+rateLevel);
//					System.out.println("type:"+rateType);
			}catch(Exception e){
				java.util.logging.Logger.getLogger(VendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}

		}

		return SUCCESS;
		
	}

}
