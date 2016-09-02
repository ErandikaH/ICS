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
@Table(name="AssignedItemStatus")
public class AssignedItemStatus implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private short id;
	private String statusName;
	private String description;
	private List<AssignItem> assignItemList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "assigned_item_status_id")
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
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="assignedItem_status")
//	public List<AssignItem> getAssignItemList() {
//		return assignItemList;
//	}
//	public void setAssignItemList(List<AssignItem> assignItemList) {
//		this.assignItemList = assignItemList;
//	}

}
