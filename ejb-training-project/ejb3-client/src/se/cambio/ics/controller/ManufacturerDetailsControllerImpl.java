/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.service.ManufacturerDetailsService;

/**
 *
 * @author PC
 */
public class ManufacturerDetailsControllerImpl extends GenericDelegate<ManufacturerDetails> implements ManufacturerDetailsController{

    private ManufacturerDetailsService service;

    public ManufacturerDetailsControllerImpl(){

        String beanName = "ManufacturerDetailsServiceImpl";
        String viewClassName = "se.cambio.ics.service.ManufacturerDetailsService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (ManufacturerDetailsService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception {
        try {
            return service.getManufacturerDetails(manufacturerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ManufacturerDetails> viewManufacturerDetailsList() throws Exception {
        try {
            return service.viewManufacturerDetailsList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        try {
            service.addManufacturerDetails(manufacturerDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteManufacturerDetails(int manufacturerId) throws Exception{
        try {
            service.deleteManufacturerDetails(manufacturerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        try {
            service.modifyManufacturerDetails(manufacturerDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public ManufacturerDetails getManufacturerDetails(String model, String make) {
		try {
            return service.getManufacturerDetails(model, make);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
	
    
}
