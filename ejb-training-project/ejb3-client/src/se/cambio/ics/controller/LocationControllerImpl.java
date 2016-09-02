/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Location;
import se.cambio.ics.service.LocationService;
import se.cambio.ics.service.LocationServiceImpl;

/**
 *
 * @author PC
 */
public class LocationControllerImpl extends GenericDelegate<Location> implements LocationController{

    private LocationService service;

    public LocationControllerImpl(){

        String beanName = "LocationServiceImpl";
        String viewClassName = "se.cambio.ics.service.LocationService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (LocationService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
        	java.util.logging.Logger.getLogger(LocationControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public Location getLocation(int locationId) {
        try {
            return service.getLocation(locationId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(LocationControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public void addLocation(Location location) {
        try {
            service.addLocation(location);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(LocationControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void deleteLocation(int locationId) {
        try {
            service.deleteLocation(locationId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(LocationControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void modifyLocation(Location location) {
        try {
            service.modifyLocation(location);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(LocationControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

	@Override
	public List<Location> getAllLocations() {
		try {
            return service.getAllLocations();
        } catch (Exception e) {
            return (List<Location>) e;
        }
       
	}

	@Override
	public List<Location> getAllLocations(int buildingNo) {
		try {
            return service.getAllLocations(buildingNo);
        } catch (Exception e) {
            return (List<Location>) e;
        }
	}

	@Override
	public List<Location> getAllLocations(int buildingNo, int floor) {
		try {
            return service.getAllLocations(buildingNo, floor);
        } catch (Exception e) {
            return (List<Location>) e;
        }
	}
	
    
}
