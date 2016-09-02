package se.cambio.ics.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RateLevel")
public class RateLevel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private short id;
	private String rateLevel;
	private String rateLevelName;
	private List<VendorRateType> vendorRateTypeList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "rate_level_id")
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	
	@Column(name = "rate_level")
	public String getRateLevel() {
		return rateLevel;
	}
	public void setRateLevel(String rateLevel) {
		this.rateLevel = rateLevel;
	}
	
	@Column(name = "rate_level_name")
	public String getRateLevelName() {
		return rateLevelName;
	}
	public void setRateLevelName(String rateLevelName) {
		this.rateLevelName = rateLevelName;
	}                     
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="vendorRateType")
//	public List<VendorRateType> getVendorRateTypeList() {
//		return vendorRateTypeList;
//	}
//	public void setVendorRateTypeList(List<VendorRateType> vendorRateTypeList) {
//		this.vendorRateTypeList = vendorRateTypeList;
//	}

}

