package se.cambio.ics.persistence;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table(name="Item")

public class Item implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private long id;
	private int version;
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
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Version
	@Column(name = "opt_lock")
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Column(name = "assetNumber")
	public String getAssetNumber() {
		return assetNumber;
	}
	
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	@Column(name = "serialNumber")
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "warrantyStartDate")
	@Temporal(TemporalType.DATE)
	public Date getWarrantyStartDate() {
		return warrantyStartDate;
	}
	public void setWarrantyStartDate(Date warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}
	@Column(name = "warrantyEndDate")
	@Temporal(TemporalType.DATE)
	public Date getWarrantyEndDate() {
		return warrantyEndDate;
	}
	public void setWarrantyEndDate(Date warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}
	
	@Column(name = "price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName="category_id")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@ManyToOne
	@JoinColumn(name="status_id", referencedColumnName="status_id")
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@ManyToOne
	@JoinColumn(name="invoice_id", referencedColumnName="invoice_id")
	public Invoice getInvoice() {
		return invoice;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	@ManyToOne
	@JoinColumn(name="department_id", referencedColumnName="department_id")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@ManyToOne
	@JoinColumn(name="manufacturer_id", referencedColumnName="manufacturer_id")
	public ManufacturerDetails getManufacturerdetails() {
		return manufacturerdetails;
	}
	public void setManufacturerdetails(ManufacturerDetails manufacturerdetails) {
		this.manufacturerdetails = manufacturerdetails;
	}	

}
