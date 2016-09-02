package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import se.cambio.ics.controller.LocationControllerImpl;
import se.cambio.ics.persistence.Location;

import com.opensymphony.xwork2.ActionSupport;

public class LocationFloorListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int buildingNo;
    private List<Integer> floors=new ArrayList<Integer>(); 
    private List<String> aaData=new ArrayList<String>(); 
    private List<Location> locationList=new ArrayList<Location>(); 
   
	public int getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}
	public List<Integer> getFloors() {
		return floors;
	}
	public void setFloors(List<Integer> floors) {
		this.floors = floors;
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
		if(buildingNo!=0){
			try {
				locationList=locationControllerImpl.getAllLocations(buildingNo);
				for(Location l:locationList){
					floors.add(l.getFloor());
				}
				
				HashSet<Integer> hashSet = new HashSet<Integer>(floors);
				floors=new ArrayList<Integer>(hashSet);
				
				for(int i=0;i<floors.size();i++){
					String f=Integer.toString(floors.get(i));
					aaData.add(f);
					
				}
				
//				for(int i=0;i<aaData.size();i++){
//					System.out.println(aaData.get(i));
//				}
//				
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(LocationFloorListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			}
		}
        return SUCCESS;

    }

}
