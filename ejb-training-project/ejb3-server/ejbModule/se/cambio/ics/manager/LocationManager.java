/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Location;

/**
 *
 * @author PC
 */
public interface LocationManager {
    
    public Location getLocation(int locationId);
    
    public List<Location> getAllLocations() ;

    public void addLocation(Location location) ;

    public void removeLocation(int locationId) ;

    public void updateLocation(Location location) ;
    
    public List<Location> getAllLocations(int buildingNo);
    
    public List<Location> getAllLocations(int buildingNo,int floor);
    
}
