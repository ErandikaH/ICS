package se.cambio.ics.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.persistence.AssignItem;

import com.opensymphony.xwork2.ActionSupport;

public class AssignItemDetailsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String assignItemId;
	private String assetNo;
	private String startDate;
	private String endDate;
	private String remark;
	private String statusName;
	private String description;
	private String buildingNo;
	private String floor;
	private String locationName;
	
	public String getAssignItemId() {
		return assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	@Override
	public String execute() {
		
		AssignItemControllerImpl assignItemControllerImpl=new AssignItemControllerImpl();
		
		if(assignItemId!=null){
			
			long itemId=0;
			itemId=Long.parseLong(assignItemId);
			AssignItem assignItem;
			try{
				assignItem=assignItemControllerImpl.getAssignItem(itemId);
				
				remark=assignItem.getRemarks();
				statusName=assignItem.getAssignItemStatusId().getStatusName();
				description=assignItem.getAssignItemStatusId().getDescription();
			
				assetNo=assignItem.getItem().getAssetNumber();
				
				int bNo=assignItem.getLocation().getBuildingNumber();
				buildingNo=Integer.toString(bNo);
				
				int f=assignItem.getLocation().getFloor();
				floor=Integer.toString(f);
				
				locationName=assignItem.getLocation().getLocationName();
				
				Date sDate=assignItem.getStartDate();
				
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				
				startDate=format.format(sDate);

				Date eDate=assignItem.getEndDate();
				endDate=format.format(eDate);
				
			}catch(Exception e){
				java.util.logging.Logger.getLogger(AssignItemDetailsAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}

		}
		
		return SUCCESS;
		
	}

}
