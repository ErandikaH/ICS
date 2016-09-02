/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.ManufacturerDetailsManager;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;


/**
 * Session Bean implementation class ManufacturerDetailsFacadeImpl
 */

@Stateless
public class ManufacturerDetailsServiceImpl implements ManufacturerDetailsService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    ManufacturerDetailsManager manufacturerDetailsService;

    @Override
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception {
        try {
            return manufacturerDetailsService.getManufacturerDetails(manufacturerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ManufacturerDetails> viewManufacturerDetailsList() throws Exception {
        try {
            return manufacturerDetailsService.viewManufacturerDetailsList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        try {
            manufacturerDetailsService.addManufacturerDetails(manufacturerDetails);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "ManufacturerDetails can not be added. ");
        }
    }

    @Override
    public void deleteManufacturerDetails(int manufacturerId) throws Exception {
        try {
            manufacturerDetailsService.removeManufacturerDetails(manufacturerId);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "ManufacturerDetails can not be deleted.");
        }
    }

    @Override
    public void modifyManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        try {
            manufacturerDetailsService.updateManufacturerDetails(manufacturerDetails);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "ManufacturerDetails can not be updated.");
        }
    }

	@Override
	public ManufacturerDetails getManufacturerDetails(String model, String make) {
		try {
            return manufacturerDetailsService.getManufacturerDetails(model, make);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
    
}
