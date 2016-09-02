package se.cambio.ics.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RateType")
public class RateType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private short id;
	private String typeName;
	private List<VendorRateType> vendorRateTypeList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "rate_type_id")
	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}
	
	@Column(name = "rate_type_name")
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="vendorRateType")
//	public List<VendorRateType> getVendorRateTypeList() {
//		return vendorRateTypeList;
//	}
//	public void setVendorRateTypeList(List<VendorRateType> vendorRateTypeList) {
//		this.vendorRateTypeList = vendorRateTypeList;
//	}

}
