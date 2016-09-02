package se.cambio.ics.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.persistence.Vendor;

import com.opensymphony.xwork2.ActionSupport;

public class VendorAction extends ActionSupport {
	
	/**
	 * 
	 */
	//vendor attributes
	private static final long serialVersionUID = 1L;
	private String vendorId;
	private String primaryContactName;
	private String secondaryContactName;
	private String companyName;
	private String address;
	private String telephone;
	private String primaryContactMobile;
	private String secondaryContactMobile;
	private String fax;
	private String primaryContactEmail;
	private String secondaryContactEmail;
	private String registrationDate;
	private String vendorAddedDate;
	private String remark;
	
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	public String getSecondaryContactName() {
		return secondaryContactName;
	}
	public void setSecondaryContactName(String secondaryContactName) {
		this.secondaryContactName = secondaryContactName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPrimaryContactMobile() {
		return primaryContactMobile;
	}
	public void setPrimaryContactMobile(String primaryContactMobile) {
		this.primaryContactMobile = primaryContactMobile;
	}
	public String getSecondaryContactMobile() {
		return secondaryContactMobile;
	}
	public void setSecondaryContactMobile(String secondaryContactMobile) {
		this.secondaryContactMobile = secondaryContactMobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}
	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}
	public String getSecondaryContactEmail() {
		return secondaryContactEmail;
	}
	public void setSecondaryContactEmail(String secondaryContactEmail) {
		this.secondaryContactEmail = secondaryContactEmail;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getVendorAddedDate() {
		return vendorAddedDate;
	}
	public void setVendorAddedDate(String vendorAddedDate) {
		this.vendorAddedDate = vendorAddedDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String execute() {
		
		VendorControllerImpl vendorController=new VendorControllerImpl();
		
		if(companyName!=null){
			Vendor v;
			try{
				v=vendorController.getVendor(companyName);
				int vId=v.getId();
				vendorId=Integer.toString(vId);
				primaryContactName=v.getPrimaryContactName();
				secondaryContactName=v.getSecondaryContactName();
				companyName=v.getCompanyName();
				address=v.getAddress();
				telephone=v.getTelephone();
				primaryContactMobile=v.getPrimaryContactMobile();
				secondaryContactMobile=v.getSecondaryContactMobile();
				fax=v.getFax();
				primaryContactEmail=v.getPrimaryContactEmail();
				secondaryContactEmail=v.getSecondaryContactEmail();
				
				Date registraion=v.getRegistrationDate();
				
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				
				registrationDate=format.format(registraion);

				Date added=v.getVendorAddedDate();
				vendorAddedDate=format.format(added);
			
				remark=v.getRemark();
				
			}catch(Exception e){
				java.util.logging.Logger.getLogger(VendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
			
			
		}
		
	
		return SUCCESS;
		
	}
}
