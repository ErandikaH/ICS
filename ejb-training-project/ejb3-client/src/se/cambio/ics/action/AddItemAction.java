package se.cambio.ics.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.controller.DepartmentControllerImpl;
import se.cambio.ics.controller.InvoiceControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.ManufacturerDetailsControllerImpl;
import se.cambio.ics.controller.StatusControllerImpl;
import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.Status;

import com.opensymphony.xwork2.ActionSupport;

public class AddItemAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String assetNumber;
	private String serialNumber;
	private String price;
	private String department;
	private String description;
	private String invoiceNumber;
	private String warrantyStartDate;
	private String warrantyEndDate;
	private String remark;
	private String make;
	private String model;
	private String statusName;
//	private String statusDescription;
	private String categoryName;
	private String dummyMsg;
	//private String categoryDescription;
	
	public String getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getWarrantyStartDate() {
		return warrantyStartDate;
	}
	public void setWarrantyStartDate(String warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}
	public String getWarrantyEndDate() {
		return warrantyEndDate;
	}
	public void setWarrantyEndDate(String warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
//	public String getStatusDescription() {
//		return statusDescription;
//	}
//	public void setStatusDescription(String statusDescription) {
//		this.statusDescription = statusDescription;
//	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDummyMsg() {
		return dummyMsg;
	}
	public void setDummyMsg(String dummyMsg) {
		this.dummyMsg = dummyMsg;
	}
//	public String getCategoryDescription() {
//		return categoryDescription;
//	}
//	public void setCategoryDescription(String categoryDescription) {
//		this.categoryDescription = categoryDescription;
//	}

	@Override
	public String execute() {
		
		Item item=new Item();
		
		CategoryControllerImpl category=new CategoryControllerImpl();
		StatusControllerImpl status=new StatusControllerImpl();
		InvoiceControllerImpl invoice=new InvoiceControllerImpl();
		DepartmentControllerImpl dep=new DepartmentControllerImpl();
		ManufacturerDetailsControllerImpl manu=new ManufacturerDetailsControllerImpl();
		
	//	HttpServletRequest req = ServletActionContext.getRequest();
		
//		long id=Long.parseLong(req.getParameter("itemId"));
//		item.setId(id);
		
		item.setAssetNumber(assetNumber);
		item.setDescription(description);
		item.setRemarks(remark);
		int serial=Integer.parseInt(serialNumber);
		item.setSerialNumber(serial);
		
		double pr=Double.parseDouble(price);
		item.setPrice(pr);
		
		String wsd = warrantyStartDate;
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date warrentySDate = null;
		
		try {
			warrentySDate= format.parse(wsd);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e2);
			//return ERROR;
			
		}
		item.setWarrantyStartDate(warrentySDate);
		
		String wed=warrantyEndDate;
		Date warrentyEDate = null;
		
		try {
			warrentyEDate= format.parse(wed);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e2);
			//return ERROR;
			
		}
		item.setWarrantyEndDate(warrentyEDate);
		
		Department d=null;
		try {
			d=dep.getDepartment(department);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		item.setDepartment(d);
		
		Invoice i=null;
		int invoiceNo=Integer.parseInt(invoiceNumber);
		try {
			i=invoice.getInvoiceByInvoiceNo(invoiceNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		
		item.setInvoice(i);
		
		Status s=null;
		try {
			s=status.getStatus(statusName);
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		item.setStatus(s);
		
		Category c=null;
		try {
		//	c=category.getCategoryByName(categoryName);
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		item.setCategory(c);
		
		ManufacturerDetails m=null;
		m=manu.getManufacturerDetails(model, make);
		
		item.setManufacturerdetails(m);
		
		ItemControllerImpl itemDelegate=new ItemControllerImpl();

		try {
			itemDelegate.addItemEntity(item);
			dummyMsg = "Added Successfully.";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			java.util.logging.Logger.getLogger(AddItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			dummyMsg = "Added Failed.";
		}

		
		return SUCCESS;
	}

}

