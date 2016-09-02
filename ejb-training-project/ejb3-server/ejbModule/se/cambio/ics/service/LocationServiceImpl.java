/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.LocationManager;
import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class LocationFacadeImpl
 */

@Stateless
public class LocationServiceImpl implements LocationService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    LocationManager locationService;

    @Override
    public Location getLocation(int locationId) {
        try {
            return locationService.getLocation(locationId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(LocationServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public void addLocation(Location location) {
        try {
            locationService.addLocation(location);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "Location can not be added. ");
        	java.util.logging.Logger.getLogger(LocationServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void deleteLocation(int locationId) {
        try {
            locationService.removeLocation(locationId);
        } catch (Exception e) {
           // DefaultExceptionHandler.reportException(e, "Location can not be deleted.");
            java.util.logging.Logger.getLogger(LocationServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void modifyLocation(Location location){
        try {
            locationService.updateLocation(location);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "Location can not be updated.");
            java.util.logging.Logger.getLogger(LocationServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

	@Override
	public List<Location> getAllLocations()  {
		try {
            return locationService.getAllLocations();
        } catch (Exception e) {
           return (List<Location>) e;
        }
        
	}

	@Override
	public List<Location> getAllLocations(int buildingNo) {
		try {
            return locationService.getAllLocations(buildingNo);
        } catch (Exception e) {
           return (List<Location>) e;
        }
	}

	@Override
	public List<Location> getAllLocations(int buildingNo, int floor) {
		try {
            return locationService.getAllLocations(buildingNo, floor);
        } catch (Exception e) {
           return (List<Location>) e;
        }
	}
    
}
