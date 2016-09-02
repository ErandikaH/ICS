package se.cambio.ics.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table(name="Vendor")
public class Vendor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int version;
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
	private Date registrationDate;
	private Date vendorAddedDate;
	private String remark;
	private List<Invoice> invoiceList;
	private List<VendorRateType> vendorRateTypeList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "vendor_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "primary_contact_name")
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	
	@Column(name = "secondary_contact_name")
	public String getSecondaryContactName() {
		return secondaryContactName;
	}
	public void setSecondaryContactName(String secondaryContactName) {
		this.secondaryContactName = secondaryContactName;
	}
	
	@Column(name = "company_name")
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column(name = "telephone")
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name = "primary_contact_mobile")
	public String getPrimaryContactMobile() {
		return primaryContactMobile;
	}
	public void setPrimaryContactMobile(String primaryContactMobile) {
		this.primaryContactMobile = primaryContactMobile;
	}
	
	@Column(name = "secondary_contact_mobile")
	public String getSecondaryContactMobile() {
		return secondaryContactMobile;
	}
	public void setSecondaryContactMobile(String secondaryContactMobile) {
		this.secondaryContactMobile = secondaryContactMobile;
	}
	
	@Column(name = "fax")
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name = "primary_contact_email")
	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}
	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}
	
	@Column(name = "secondary_contact_email")
	public String getSecondaryContactEmail() {
		return secondaryContactEmail;
	}
	public void setSecondaryContactEmail(String secondaryContactEmail) {
		this.secondaryContactEmail = secondaryContactEmail;
	}
	
	@Column(name = "registration_date")
	@Temporal(TemporalType.DATE)
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	@Column(name = "vendor_added_date")
	@Temporal(TemporalType.DATE)
	public Date getVendorAddedDate() {
		return vendorAddedDate;
	}
	public void setVendorAddedDate(Date vendorAddedDate) {
		this.vendorAddedDate = vendorAddedDate;
	}
	
	@Column(name = "remark")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="vendor")
//	public List<Invoice> getInvoiceList() {
//		return invoiceList;
//	}
//	public void setInvoiceList(List<Invoice> invoiceList) {
//		this.invoiceList = invoiceList;
//	}
//	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="vendorRateType")
//	public List<VendorRateType> getVendorRateTypeList() {
//		return vendorRateTypeList;
//	}
//	public void setVendorRateTypeList(List<VendorRateType> vendorRateTypeList) {
//		this.vendorRateTypeList = vendorRateTypeList;
//	}

}
