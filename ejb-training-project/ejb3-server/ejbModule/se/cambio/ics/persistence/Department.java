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
@Table(name="Department")
public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private short id;
	private String name;
	private List<Item> itemList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "department_id")
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="department")
//	public List<ItemEntity> getItemList() {
//		return itemList;
//	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
