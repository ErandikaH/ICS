/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.ManufacturerDetails;
import se.cambio.ics.persistence.EAO.ManufacturerDetailsEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class ManufacturerDetailsManagerBean implements ManufacturerDetailsManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    ManufacturerDetailsEAO manufacturerDetailsDAO;
	
    public ManufacturerDetailsManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<ManufacturerDetails> viewManufacturerDetailsList() throws Exception {
        return manufacturerDetailsDAO.viewManufacturerDetailsList();
    }
    
    @Override
    public ManufacturerDetails getManufacturerDetails(int manufacturerId) throws Exception {
        return manufacturerDetailsDAO.getManufacturerDetails(manufacturerId);
    }

    @Override
    public void addManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        manufacturerDetailsDAO.create(manufacturerDetails);
    }

    @Override
    public void removeManufacturerDetails(int manufacturerId) throws Exception {
        ManufacturerDetails manufacturerDetails = new ManufacturerDetails();
        manufacturerDetails.setId(manufacturerId);
        manufacturerDetailsDAO.delete(manufacturerDetails);
    }

    @Override
    public void updateManufacturerDetails(ManufacturerDetails manufacturerDetails) throws Exception {
        manufacturerDetailsDAO.update(manufacturerDetails);
    }

	@Override
	public ManufacturerDetails getManufacturerDetails(String model, String make) {
		return manufacturerDetailsDAO.getManufacturerDetails(model, make);
	}
}
