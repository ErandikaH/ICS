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
@Table(name="ManufacturerDetails")
public class ManufacturerDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String make;
	private String model;
	private List<Item> itemsList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "manufacturer_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "make")
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	@Column(name = "model")
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="manufacturerDetails")
//	public List<ItemEntity> getItemsList() {
//		return itemsList;
//	}
//	public void setItemsList(List<ItemEntity> itemsList) {
//		this.itemsList = itemsList;
//	}
	

}
