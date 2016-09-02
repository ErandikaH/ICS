/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.ManufacturerDetails;
/**
 *
 * @author PC
 */
public interface ManufacturerDetailsController {
    
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception;
    
    public ManufacturerDetails getManufacturerDetails(String model, String make);
    
    public List<ManufacturerDetails> viewManufacturerDetailsList()throws Exception;

    public void addManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception;

    public void deleteManufacturerDetails(int manufacturerId) throws Exception;

    public void modifyManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception;
    
}
