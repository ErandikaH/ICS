package se.cambio.ics.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Invoice")
public class Invoice implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private int invoiceNumber;
	private Date date;
	private String description;
	private int numberOfItems;
	private double totalAmount;
	private List<Payment> paymentList;
	private Vendor vendor;
	private List<Item> itemList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "invoice_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "invoice_number")
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	@Column(name = "date")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "number_of_items")
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
	@Column(name = "total_amount")
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
//	@OneToMany(targetEntity=Item.class, mappedBy="invoice")
//	public List<Payment> getPaymentList() {
//		return paymentList;
//	}
//	public void setPaymentList(List<Payment> paymentList) {
//		this.paymentList = paymentList;
//	}
//	
	@ManyToOne
	@JoinColumn(name="vendor_id", referencedColumnName="vendor_id")
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
//	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="invoice")
//	public List<ItemEntity> getItemList() {
//		return itemList;
//	}
//	public void setItemList(List<ItemEntity> itemList) {
//		this.itemList = itemList;
//	}

}
