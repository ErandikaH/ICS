package se.cambio.ics.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.persistence.Vendor;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateVendorAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
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
	private String vendorName;
	private String dummyMsg;
	private String errorMsg;

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
		
		Vendor vendor = null;
		VendorControllerImpl vendorControl=new VendorControllerImpl();
		//int vendorId = 0;
		try {
			vendor = vendorControl.getVendor(vendorName);
		} catch (Exception e) {
			//errorMsg="$";
			// TODO Auto-generated catch block
			//java.util.logging.Logger.getLogger(SearchVendorRatesAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			System.out.println("No such vendors");
		}
		
		vendor.setPrimaryContactName(primaryContactName);
		vendor.setSecondaryContactName(secondaryContactName);
		vendor.setCompanyName(companyName);
		vendor.setAddress(address);
		vendor.setTelephone(telephone);
		vendor.setFax(fax);
		vendor.setPrimaryContactMobile(primaryContactMobile);
		vendor.setSecondaryContactMobile(secondaryContactMobile);
		vendor.setPrimaryContactEmail(primaryContactEmail);
		vendor.setSecondaryContactEmail(secondaryContactEmail);
		vendor.setRemark(remark);
		
		String regDate = registrationDate;
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date dateRegistration = null;
		
		try {
			dateRegistration= format.parse(regDate);
		} catch (ParseException e2) {
			dummyMsg = "Updated Failed.:" + e2.getMessage();
			java.util.logging.Logger.getLogger(UpdateVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e2);
		//	return ERROR;
			
		}
		vendor.setRegistrationDate(dateRegistration);
		
//		Date currentDate = new Date();
//		vendor.getVendorAddedDate();
	
		try {
			vendorControl.modifyVendor(vendor);
			dummyMsg = "Updated Successfully.";
			return SUCCESS;
		} catch (Exception e) {
			errorMsg="$";
			//java.util.logging.Logger.getLogger(UpdateVendorAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			dummyMsg = "Updated Failed.:" + e.getMessage();
			return ERROR;
		}
		
		
		//return SUCCESS;
	}

}
