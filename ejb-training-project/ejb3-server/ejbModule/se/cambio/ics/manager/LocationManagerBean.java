/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.EAO.LocationEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class LocationManagerBean implements LocationManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    LocationEAO locationDAO;
	
    public LocationManagerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Location getLocation(int locationId) {
      
        return locationDAO.getLocation(locationId);
    }

    @Override
    public void addLocation(Location location)  {
        locationDAO.create(location);
    }

    @Override
    public void removeLocation(int locationId) {
        Location location = new Location();
        location.setId(locationId);
        locationDAO.delete(location);
    
    }

    @Override
    public void updateLocation(Location location){
        locationDAO.update(location);
    }
    
    @Override
    public List<Location> getAllLocations() {
    	return locationDAO.getAllLocations();
    }

	@Override
	public List<Location> getAllLocations(int buildingNo) {
		return locationDAO.getAllLocations(buildingNo);
	}

	@Override
	public List<Location> getAllLocations(int buildingNo, int floor) {
		return locationDAO.getAllLocations(buildingNo, floor);
	}
}
