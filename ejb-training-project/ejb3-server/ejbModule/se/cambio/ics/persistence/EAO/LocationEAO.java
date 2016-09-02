/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Location;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;


/**
 *
 * @author PC
 */
public interface LocationEAO extends GenericEAO<Location>{
    
    public Location getLocation(int locationId);
    
    public List<Location> getAllLocations();
    
    public List<Location> getAllLocations(int buildingNo);
    
    public List<Location> getAllLocations(int buildingNo,int floor);
    
}
