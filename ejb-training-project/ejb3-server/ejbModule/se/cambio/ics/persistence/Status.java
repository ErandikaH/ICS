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
@Table(name="Status")
public class Status implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private short id;
	private String statusName;
	private String description;
	private List<Item> itemList;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "status_id")
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	
	@Column(name = "status_name")
	public String getStatusName() {
		return statusName;
	}
	
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="status")
//	public List<ItemEntity> getItemList() {
//		return itemList;
//	}
//	public void setItemList(List<ItemEntity> itemList) {
//		this.itemList = itemList;
//	}
	

}
