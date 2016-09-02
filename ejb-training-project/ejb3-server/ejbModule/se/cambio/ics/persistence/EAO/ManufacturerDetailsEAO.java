/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface ManufacturerDetailsEAO extends GenericEAO<ManufacturerDetails>{
    
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception;
    
    public ManufacturerDetails getManufacturerDetails(String model, String make);
    
    public List<ManufacturerDetails> viewManufacturerDetailsList()throws Exception;

}
