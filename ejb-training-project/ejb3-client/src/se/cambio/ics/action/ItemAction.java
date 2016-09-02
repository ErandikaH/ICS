package se.cambio.ics.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.AssignedItemStatusControllerImpl;
import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.controller.DepartmentControllerImpl;
import se.cambio.ics.controller.InvoiceControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.LocationControllerImpl;
import se.cambio.ics.controller.ManufacturerDetailsControllerImpl;
import se.cambio.ics.controller.StatusControllerImpl;
import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.model.GetClassIds;
import se.cambio.ics.persistence.AssignedItemStatus;
import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.Department;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.Status;
import se.cambio.ics.persistence.User;
import se.cambio.ics.persistence.Vendor;

import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private String itemId;
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
	private String statusDescription;
	private String categoryName;
	private String dummyMsg;
	private String categoryDescription;
	
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
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
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
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	@Override
	public String execute() {
		
		ItemControllerImpl itemControllerImpl=new ItemControllerImpl();
		
		if(assetNumber!=null){
			Item item;
			try{
				item=itemControllerImpl.getItem(assetNumber);
				long iId=item.getId();
				itemId=Long.toString(iId);
				assetNumber=item.getAssetNumber();
				description=item.getDescription();
				department=item.getDepartment().getName();
				
				int serialNo=item.getSerialNumber();
				serialNumber=Integer.toString(serialNo);
				
				double pr=item.getPrice();
				price=Double.toString(pr);
				
				int invoiceNo=item.getInvoice().getInvoiceNumber();
				invoiceNumber=Integer.toString(invoiceNo);
				remark=item.getRemarks();
				make=item.getManufacturerdetails().getMake();
				model=item.getManufacturerdetails().getModel();
				
				statusName=item.getStatus().getStatusName();
				statusDescription=item.getStatus().getDescription();
				
				categoryName=item.getCategory().getCategoryName();
				categoryDescription=item.getCategory().getDescription();
			
				Date wsDate=item.getWarrantyStartDate();
				
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				
				warrantyStartDate=format.format(wsDate);

				Date weDate=item.getWarrantyEndDate();
				warrantyEndDate=format.format(weDate);
				
			}catch(Exception e){
				java.util.logging.Logger.getLogger(ItemAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
			
			
		}
		
		return SUCCESS;
		
	}


}
