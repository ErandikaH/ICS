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
@Table(name="Location")
public class Location implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int buildingNumber;
	private int floor;
	private String locationName;
	private List<AssignItem> assignedItemList;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "location_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "building_number")
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	
	@Column(name = "floor")
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	@Column(name = "location_name")
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="location")
//	public List<AssignItem> getAssignedItemList() {
//		return assignedItemList;
//	}
//	public void setAssignedItemList(List<AssignItem> assignedItemList) {
//		this.assignedItemList = assignedItemList;
//	}

}
