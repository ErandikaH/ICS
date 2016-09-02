package se.cambio.ics.validation;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.Status;

public class ItemValidation {
	
	private String assetNumber;
	private int serialNumber;
	private String description;
	private Date warrantyStartDate;
	private Date warrantyEndDate;
	private double price;
	private String remarks;
	private Status status;
	private Invoice invoice;
	private Department department;
	private ManufacturerDetails manufacturerdetails;
	private Category category;
	
	public boolean validItem() {
		HttpServletRequest req = ServletActionContext.getRequest();
		assetNumber=req.getParameter("");
		return false;
	}
	//HttpServletRequest req = ServletActionContext.getRequest();
	
	
//	long id=Long.parseLong(req.getParameter("itemId"));
//	item.setId(id);
	
	
	
	

}
