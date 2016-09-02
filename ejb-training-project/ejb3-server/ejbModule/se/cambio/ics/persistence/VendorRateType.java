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
@Table(name="VendorRateType")
public class VendorRateType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int version;
	private Date date;
	private Vendor vendor;
	private RateType rateType;
	private RateLevel rateLevel;
	private String remarks;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "vendor_rate_type_id")
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
	
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@ManyToOne
	@JoinColumn(name="vendor_id", referencedColumnName="vendor_id")
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	@ManyToOne
	@JoinColumn(name="rate_type_id", referencedColumnName="rate_type_id")
	public RateType getRateType() {
		return rateType;
	}
	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}
	
	@ManyToOne
	@JoinColumn(name="rate_level_id", referencedColumnName="rate_level_id")
	public RateLevel getRateLevel() {
		return rateLevel;
	}
	public void setRateLevel(RateLevel rateLevel) {
		this.rateLevel = rateLevel;
	}
	
		

}
