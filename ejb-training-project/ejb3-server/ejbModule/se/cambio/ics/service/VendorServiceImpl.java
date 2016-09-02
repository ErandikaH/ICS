/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.VendorManager;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class VendorFacadeImpl
 */

@Stateless
public class VendorServiceImpl implements VendorService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    VendorManager vendorService;

    @Override
    public Vendor getVendor(int vendorId) throws Exception {
        
            return vendorService.getVendor(vendorId);
        
    }

    @Override
    public List<Vendor> getAllVendorsList() throws Exception {
       
            return vendorService.getAllVendorsList();
        
    }

    @Override
    public void addVendor(Vendor vendor) throws Exception {
        
            vendorService.addVendor(vendor);
        
    }

    @Override
    public void deleteVendor(int vendorId,int version)  throws Exception{
     
            vendorService.removeVendor(vendorId,version);
        
    }

    @Override
    public void modifyVendor(Vendor vendor) throws Exception{
       
            vendorService.updateVendor(vendor);
        
    }

	@Override
	public Vendor getVendor(String companyName)throws Exception {

            return vendorService.getVendor(companyName);
      
      
	}

	@Override
	public List<Vendor> getAllVendorsListByName(String companyName)throws Exception {
		
            return vendorService.getAllVendorsListByName(companyName);
        
	}
}
