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

@Entity
@Table(name="AssignItem")
public class AssignItem implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long id;
	private Item item;
//	private int userId;
	private Date startDate;
	private Date endDate;
	private String remarks;
	private Location location;
	private AssignedItemStatus assignItemStatusId;
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	} 
	
	
	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@ManyToOne
	@JoinColumn(name="assigned_item_status_id", referencedColumnName="assigned_item_status_id")
	public AssignedItemStatus getAssignItemStatusId() {
		return assignItemStatusId;
	}
	public void setAssignItemStatusId(AssignedItemStatus assignItemStatusId) {
		this.assignItemStatusId = assignItemStatusId;
	}
	
	@ManyToOne
	@JoinColumn(name="item_id", referencedColumnName="id")
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	@ManyToOne
	@JoinColumn(name="location_id", referencedColumnName="location_id")
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
