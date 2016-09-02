package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import se.cambio.ics.controller.LocationControllerImpl;
import se.cambio.ics.persistence.Location;

import com.opensymphony.xwork2.ActionSupport;

public class LocationNameListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int buildingNo;
	private int floor;
    private List<String> aaData=new ArrayList<String>(); 
    private List<Location> locationList=new ArrayList<Location>(); 
   
	public int getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public List<Location> getLocationList() {
		return locationList;
	}
	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}
	public List<String> getAaData() {
		return aaData;
	}
	public void setAaData(List<String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    
		LocationControllerImpl locationControllerImpl=new LocationControllerImpl();
		
		try {
			locationList=locationControllerImpl.getAllLocations(buildingNo, floor);
			for(Location l:locationList){
				aaData.add(l.getLocationName());
			}
			
			HashSet<String> hashSet = new HashSet<String>(aaData);
			aaData=new ArrayList<String>(hashSet);
			
//			for(int i=0;i<aaData.size();i++){
//				System.out.println(aaData.get(i));
//			}
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(LocationNameListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
        
        return SUCCESS;

    }
}
