/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;
import java.util.List;

import se.cambio.ics.persistence.Location;

/**
 *
 * @author PC
 */
public interface LocationController {
    
    public Location getLocation(int locationId);
    
    public List<Location> getAllLocations(int buildingNo);
    
    public List<Location> getAllLocations(int buildingNo,int floor);
    
    public List<Location> getAllLocations();

    public void addLocation(Location location) ;

    public void deleteLocation(int locationId);

    public void modifyLocation(Location location);
    
}
