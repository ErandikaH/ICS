/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.ManufacturerDetails;

/**
 *
 * @author PC
 */
public interface ManufacturerDetailsManager {
    
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception;
    
    public ManufacturerDetails getManufacturerDetails(String model, String make);
    
    public List<ManufacturerDetails> viewManufacturerDetailsList()throws Exception;

    public void addManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception;

    public void removeManufacturerDetails(int manufacturerId) throws Exception;

    public void updateManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception;
    
}
